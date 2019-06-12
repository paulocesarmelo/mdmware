package br.inf.ufg.mddsm.controller.tests

import org.eclipse.emf.common.util.EList
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

import base.Manager
import br.inf.ufg.mddsm.controller.emf.EMFLoader
import br.inf.ufg.mddsm.controller.emf.EmfModelHandler
import br.inf.ufg.mddsm.controller.handlers.EventManager
import br.inf.ufg.mddsm.controller.img.NaiveGenerator.Repository
import br.inf.ufg.mddsm.controller.manager.MainManager
import br.inf.ufg.mddsm.controller.manager.ManagerFacade
import br.inf.ufg.mddsm.controller.emf.ManagerFactory
import br.inf.ufg.mddsm.controller.emf.ModelHandler
import br.inf.ufg.mddsm.controller.resource.ResourceManager
import dsc.DSK
import dsc.DscPackage


class TestLoadDSCs {
    
        static EventManager eventManager
        static MainManager mainManager
        static ResourceManager resourceManager
        static Repository repo
        static ModelHandler modelHandler = new EmfModelHandler();
        
        @BeforeAll
        static void main(String[] args) {
            
            /*Manager managerDef = EMFLoader.loadFirst("dsk-comm.xmi", Manager)
            eventManager = new EventManager()
            mainManager = new ManagerFactory().createManager(managerDef)
            resourceManager = mainManager.resourceManager
            
            mainManager.start()*/
            
            def model = "dsk-comm.xmi"
            
            //def resModel = modelHandler.load(model.toURI(), DscPackage.eNS_URI, DscPackage.eINSTANCE)
			
			DSK dsk = modelHandler.load(model.toURI())
			
			//DSK dsk = (DSK) resModel
           	
			//EList list = dsk.getProcedures()
			int i=0
			dsk.getProcedures().each { 
				println (dsk.getProcedures().get(i++).getName())
			}            
            
        }
		
		static void createRepository() {
			Repository repo = Repository.getInstance()
			
		}
}
    
    