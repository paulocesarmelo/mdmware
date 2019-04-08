package controller.actions.mm;

import java.util.Map;
import java.util.Set;

import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.controller.state.StateHolder;
import br.inf.ufg.mddsm.controller.state.StateTypeManager;
import controller.managers.MScriptManager;
import controller.tests.MwScriptManager;

public class DispatchScript implements MacroActionInstance{

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		
		Object id = "MMS01";
		StateTypeManager stateManager = ctx.getStateManager().getType("MainManagerState");
		StateHolder state;
		if(!stateManager.exists(id)){
			state = stateManager.create(id);
			MwScriptManager mwScriptManager = new MwScriptManager();
			state.set("scriptManager", mwScriptManager.getManager());
		}else{
			state = stateManager.get(id);
		}
		MScriptManager scriptManager = (MScriptManager)state.get("scriptManager");
		scriptManager.processScript((String)params.get("aScript"));
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
	}

}
