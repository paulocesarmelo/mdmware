package controller.actions;
import java.util.Hashtable;
import java.util.Map;

import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance;
import controller.util.BuildCmdHashTable;


public class AddLoadDeviceType implements MacroActionInstance {
	private Hashtable<String,Object> properties = new Hashtable<String,Object>();
	

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		return null;
	}

}
