package br.inf.ufg.mddsm.controller.tests

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import base.Manager
import br.inf.ufg.mddsm.controller.emf.EMFLoader
import br.inf.ufg.mddsm.controller.handlers.EventManager
import br.inf.ufg.mddsm.controller.manager.MainManager
import br.inf.ufg.mddsm.controller.manager.ManagerFacade
import br.inf.ufg.mddsm.controller.emf.ManagerFactory
import br.inf.ufg.mddsm.controller.resource.ResourceManager

class TestLoadDSCs {
	
		static EventManager eventManager
		static MainManager mainManager
		static ResourceManager resourceManager
		
		@BeforeAll
		static void main(String[] args) {
			
			Manager managerDef = EMFLoader.loadFirst("dsk-comm.xmi", Manager)
			eventManager = new EventManager()
			mainManager = new ManagerFactory().createManager(managerDef)
			resourceManager = mainManager.resourceManager
			
			mainManager.start()
			test();
		}
		
		@AfterAll
		static void tearDown() {
			mainManager.stop()
		}
		
		@Test
		static void test() {
			TestFrontEnd frontend = new TestFrontEnd(mainManager)
			frontend.testCall(new Object())
		}
	
	}
	
	class TestFrontEnd extends ManagerFacade {
		public TestFrontEnd(MainManager manager) {
			super(manager)
		}
		
		def testCall(def arg) {
			enqueue("testAction", ["arg":arg])
		}
	}
	