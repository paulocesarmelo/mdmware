package br.inf.ufg.mddsm.broker.adapter.main

import br.inf.ufg.mddsm.broker.adapter.repositories.AdapterRepository
import br.inf.ufg.mddsm.controller.img.DSC
import adapter.platform.PSResource;


import java.util.Iterator;
import java.util.LinkedList;

class CommandExecutor {
	
	private AdapterRepository adapterRepo = AdapterRepository.getInstance();
	
	
	public void execute(DSC dsc) {
		Binding binding = new Binding();
		GroovyShell shell = new GroovyShell(binding);
		
		PSResource resource = adapterRepo.getResourceRelated(dsc)
		
		shell.setVariable("dsc", dsc);
		shell.setVariable("resource", resource);
		
		execute(adapterRepo.getFunctionBody())
		
	}
	
	public void execute(String cmd) {
		Binding binding = new Binding();
		GroovyShell Shell = new GroovyShell(binding);
		Object value = Shell.evaluate(cmd);
	}
	
	public void test() {
		Binding binding = new Binding();
		GroovyShell shell = new GroovyShell(binding);
		String n = "test";
		shell.setVariable("n", "test");
		String cmd = "for (x=0; x<5; x++){println(n) }; return(x);";
		Object value = shell.evaluate(cmd);
	}
}
