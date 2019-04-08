package controller.actions.sm;

import java.util.Map;
import java.util.Set;

import types.TypeEnum;
import broker.managers.MHB_TopManager;

import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.controller.state.StateHolder;

public class RemoveDevice implements MacroActionInstance{

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		Object id = "CE01";
		StateHolder state = ctx.getStateManager().getType("CommandExecutorState").get(id);
		MHB_TopManager brokerManager = (MHB_TopManager)state.get("broker");
		//brokerManager.remLocalCtrlr((String)params.get("entityID"));
		brokerManager.remLocalCtrlr("LC001");
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
	}

}
