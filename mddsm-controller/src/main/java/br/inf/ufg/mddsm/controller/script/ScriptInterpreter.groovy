package br.inf.ufg.mddsm.controller.script

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature

class ScriptInterpreter{
	
	public void interpreter(ControlScript script) {
		
		//List<Command> commands = script.commands
						
		/*commands.each{
			interpret($(it))
		}*/
		
		Command c = new Command()
		
		println("Interpreting script... ")
		
		List<String> commands = script.commandsList
		
		new ScriptProcessor().processor(commands)
		
	}
	
	public void interpret(Command command) {
		Map metadata = command.valueMetada();
		
		switch(command.action()) {
			case CommandAction.ADD: 
				assert metadata.get("kindInteraction") == "DISTRIBUTED"
				
				EObject source = command.source()
				EStructuralFeature feature = source.eClass().getEStructuralFeature("name")
				String sourceName = (String)source.eGet(feature)
				
				EObject target = command.target()
				 
			
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