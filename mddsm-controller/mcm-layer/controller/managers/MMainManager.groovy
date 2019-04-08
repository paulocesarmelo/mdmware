package controller.managers;

import java.util.Map;

import br.inf.ufg.mddsm.controller.manager.MainManager;
import br.inf.ufg.mddsm.controller.manager.ManagerFacade;
import controller.interfaces.MMainManagerInterface

/*  Welcome to kernel of Microgrid Control Middleware  */


public class MMainManager extends ManagerFacade implements MMainManagerInterface {
	
	public MMainManager(MainManager manager) {
		super(manager);
	}

	@Override
	public Object dispatchScript(String script) {
		Map params = ["script":script];
		return enqueue("DispatchScript", params);
	}

}
