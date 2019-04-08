package controller.actions.mm;

import java.util.Map;
import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance;

public class MiddlewareEvent implements MacroActionInstance{

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		return null;
	}

}
