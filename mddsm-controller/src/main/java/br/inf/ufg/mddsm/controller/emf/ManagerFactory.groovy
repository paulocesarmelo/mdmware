package br.inf.ufg.mddsm.controller.emf

import base.Manager
import br.inf.ufg.mddsm.controller.autonomic.AutonomicManager
import br.inf.ufg.mddsm.controller.manager.MainManager
import br.inf.ufg.mddsm.controller.manager.SignalHandlerManager
import br.inf.ufg.mddsm.controller.policy.PolicyEvaluationManager
import br.inf.ufg.mddsm.controller.policy.metadata.Metadata
import br.inf.ufg.mddsm.controller.resource.ResourceManager
import br.inf.ufg.mddsm.controller.state.StateManager

class ManagerFactory {
    private HandlerFactory handlerFactory = new HandlerFactory()
    private ResourceManagerFactory objectManagerFactory = new ResourceManagerFactory()
    private MetadataFactory metadataFactory = new MetadataFactory()

    MainManager createManager(Manager manager) {
        SignalHandlerManager signalHandlerManager = handlerFactory.createSignalHandlerManager(manager.handlers)
        ResourceManager resourceManager = objectManagerFactory.createObjectManager(manager.resourceManager)

        Metadata metadata = metadataFactory.createMetadata(manager)
        MainManager mainManager = new MainManager(metadata, signalHandlerManager, resourceManager, new StateManager(manager.stateManager.stateTypes))

        if (manager.autonomicManager) {
            AutonomicManager mape = new AutonomicManager(manager.autonomicManager, mainManager.getContext())
            signalHandlerManager.register(-1, mape.getSignalHandler())
        }

        if (manager.policyManager) {
            PolicyEvaluationManager pem = new PolicyEvaluationManager(manager.policyManager)
            signalHandlerManager.register(-1, pem.getSignalHandler())
        }


        mainManager
    }
}
