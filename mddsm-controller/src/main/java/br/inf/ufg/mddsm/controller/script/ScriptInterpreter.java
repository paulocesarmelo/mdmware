package br.inf.ufg.mddsm.controller.script;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.compare.Diff;

public class ScriptInterpreter {

	private List<Diff> diffs;
	
	public void interpreter(List<Diff> diffs) {
		this.diffs = diffs;
		List commands = extractCommand();
		
		ScriptProcessor processor = new ScriptProcessor();
	}
	
	public List<String> extractCommand() {
		
		List<String> commands = new LinkedList<String>();
		
		//Not implemented yet
		
		
		
		return commands;
		
	}
	
	
	
}
