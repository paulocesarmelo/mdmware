package br.inf.ufg.mddsm.controller.script

import org.eclipse.emf.compare.Diff

class ControlScript {
	private final List<Command> commands

	ControlScript() {
		commands = []
	}

	ControlScript leftShift(Diff diff) {
		commands << new Command(diff)
		this
	}

	ControlScript leftShift(Command command) {
		commands << command
		this
	}

	ControlScript leftShift(EventObject event) {
		commands << new Command(event)
	}

	int size() {
		commands.size()
	}
	
}