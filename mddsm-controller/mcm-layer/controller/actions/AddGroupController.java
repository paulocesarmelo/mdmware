package controller.actions;


import java.util.Map;


import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance;


public class AddGroupController implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		System.out.println("New group!");
		return null;
	}

}
