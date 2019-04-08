package controller.actions;

import java.util.Map;

import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance;

public class InitializeMGrid implements MacroActionInstance{

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		System.out.println("Iron fist!");
		return null;
	}

}
