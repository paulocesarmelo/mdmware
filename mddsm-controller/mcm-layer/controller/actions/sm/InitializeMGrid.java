package controller.actions.sm;

import java.util.Map;

import broker.managers.MHB_TopManager;
import controller.tests.Broker;
import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.controller.state.StateHolder;
import br.inf.ufg.mddsm.controller.state.StateTypeManager;

public class InitializeMGrid implements MacroActionInstance{

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		
		System.out.println("Test beta");
		Object id = "SMS01";
		StateTypeManager stateManager = ctx.getStateManager().getType("ScriptManagerState");
		StateHolder state;
		
		if(!stateManager.exists(id)){
			state = stateManager.create(id);
			Broker broker = new Broker();
			state.set("broker", broker.getManager());
		}else{
			state = stateManager.get(id);
		}
		
		MHB_TopManager brokerManager = (MHB_TopManager)state.get("broker");
		brokerManager.start((String)params.get("aMgridID"));
		//brokerManager.execute(new SignalInstance("Start", params));
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
	}

}
