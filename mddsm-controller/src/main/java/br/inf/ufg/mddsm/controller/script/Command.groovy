package br.inf.ufg.mddsm.controller.script

import org.eclipse.emf.compare.AttributeChange
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.ReferenceChange
import org.eclipse.emf.compare.ResourceAttachmentChange
import org.eclipse.emf.ecore.EObject

import groovy.util.logging.Log4j2


@Log4j2
class Command {
    final private Diff diff

    Command(EventObject event) {
        throw new UnsupportedOperationException("Not handling EventObject yet")
    }

    Command(Diff diff) {
        this.diff = diff
    }

    EObject source() {
        diff.match.left
    }

    EObject target() {
        if(diff instanceof AttributeChange) {
            return diff.attribute
        }
        return diff.reference
    }

    EObject updatedElement() {
        diff.match.right
    }

    def value() {
        diff.value  
    }

    Map valueMetadata() {
        extractMetadata(value())
    }

    private Map extractMetadata(def value) {
        Map metadata = [:]
        if(value instanceof EObject) {
            metadata["priority"] = value.commandPriority
            addMetapropertyToMap(metadata, "cardinality", value)
            addMetapropertyToMap(metadata, "interactionBehavior", value)
            addMetapropertyToMap(metadata, "kindInteraction", value)
            addMetapropertyToMap(metadata, "arisingBehavior", value)
        }
        return metadata
    }

    private addMetapropertyToMap(Map map, String propertyName, def source) {
        if(source.properties.containsKey(propertyName)) {
            map[propertyName] = source?."${propertyName}"
        }
    }

    Map sourceMetadata() {
        extractMetadata(source())
    }

    CommandAction action() {
        switch (diff.kind) {
            case DifferenceKind.ADD: return CommandAction.ADD
            case DifferenceKind.DELETE: return CommandAction.DELETE
            case DifferenceKind.CHANGE: return CommandAction.CHANGE
            case DifferenceKind.MOVE: return CommandAction.MOVE
            case DifferenceKind.ADD_VALUE: return CommandAction.ADD_VALUE
            case DifferenceKind.CHANGE_VALUE: return CommandAction.CHANGE_VALUE
            case DifferenceKind.DELETE_VALUE: return CommandAction.DELETE_VALUE
            case DifferenceKind.MOVE_VALUE: return CommandAction.MOVE_VALUE
            default:
                log.error "Action ${diff.kind} not supported"
                throw new RuntimeException("Action not supported")
        }
    }
}

enum CommandAction {
    ADD, DELETE, CHANGE, MOVE, ADD_VALUE, CHANGE_VALUE, DELETE_VALUE, MOVE_VALUE
}
