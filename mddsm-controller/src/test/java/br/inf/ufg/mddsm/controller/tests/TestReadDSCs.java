package br.inf.ufg.mddsm.controller.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import base.Manager;
import br.inf.ufg.mddsm.controller.emf.EMFLoader;
import br.inf.ufg.mddsm.controller.emf.ManagerFactory;
import br.inf.ufg.mddsm.controller.handlers.EventManager;
import br.inf.ufg.mddsm.controller.manager.MainManager;
import br.inf.ufg.mddsm.controller.manager.ManagerFacade;
import br.inf.ufg.mddsm.controller.resource.ResourceManager;


public class TestReadDSCs {
	
	static EventManager eventManager;
	static MainManager mainManager;
	static ResourceManager resourceManager;
	
	@BeforeAll
	public static void main(String[] args) {
		
		Manager managerDef = EMFLoader.loadFirst("dsc.xmi", Manager);
		eventManager = new EventManager();
		mainManager = new ManagerFactory().createManager(managerDef);
		resourceManager = mainManager.getResourceManager();
		
		mainManager.start();
		test();
	}
	
	@AfterAll
	static void tearDown() {
		mainManager.stop();
	}
	
	@Test
	static void test() {
		TestFrontEnd frontend = new TestFrontEnd(mainManager);
		frontend.testCall(new Object());
	}

}

public class TestFrontEnd extends ManagerFacade {
	public TestFrontEnd(MainManager manager) {
		super(manager);
	}
	
	void testCall(Object arg) {
		//enqueue("testAction", ["arg":arg])
	}
}
