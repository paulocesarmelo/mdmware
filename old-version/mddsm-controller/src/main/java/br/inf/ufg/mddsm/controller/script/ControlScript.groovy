package br.inf.ufg.mddsm.controller.script

import org.eclipse.emf.compare.Diff

class ControlScript {
	private final List<Command> commands
	private final List<String> commandsList;

	ControlScript() {
		commands = []
		commandsList = []
		commandsList << new String("Send")
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