package br.inf.ufg.mddsm.controller.script

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature

import br.inf.ufg.mddsm.controller.img.DSC
import br.inf.ufg.mddsm.controller.img.Type

class ScriptInterpreter{
	
	public void interpret(ControlScript script) {
		
		//List<Command> commands = script.commands
						
		/*commands.each{
			interpret($(it))
		}*/
		
		println("Interpreting script... ")
		
		List<String> commands = script.commandsList
		
		new ScriptProcessor().process(commands)
		
	}
	
	public void extractCommand(Command metaCommand) {
		Map metadata = metaCommand.valueMetada();
		
		switch(metaCommand.action()) {
			case CommandAction.ADD:
							
				EObject source = metaCommand.source()
				EStructuralFeature feature = source.eClass().getEStructuralFeature("name")
				String sourceName = (String)source.eGet(feature)
				
				EObject target = metaCommand.target()
				EStructuralFeature feature2 = source.eClass().getEStructuralFeature("name")
				String targetName = (String)target.eGet(feature2)
				
				String associationName = sourceName+targetName;
				 
				DSC dsc = new DSC(associationName, Type.ASSOC);
				
				assert metadata.get("interactionBehavior") == "SYNC"
			
			case CommandAction.DELETE:
				log.info "Not implemented yet"
				break
				
			case CommandAction.CHANGE:
				log.info "Not implemented yet"
				break
				
			default:
				log.error "Action ${action} not supported"
				throw new RuntimeException("Action not supported")
		}
		
	}
	
}