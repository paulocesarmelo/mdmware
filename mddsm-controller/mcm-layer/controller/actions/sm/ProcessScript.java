package controller.actions.sm;

import java.util.Map;

import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.controller.state.StateHolder;
import br.inf.ufg.mddsm.controller.state.StateTypeManager;
import controller.managers.MCommandExecutor;
import controller.managers.MScriptManager;
import controller.reflection.Reflection;
import controller.tests.MwCommandExecutor;
import controller.tests.MwScriptManager;
import controller.util.CommandTokenizer;

public class ProcessScript implements MacroActionInstance {

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		Object id = "SMS01";
		//StateTypeManager stateManager = ctx.getStateManager().getType("ScriptManagerState");
		//StateHolder state;
		//if(!stateManager.exists(id)){
		//	state = stateManager.create(id);
			//MwCommandExecutor mwCommandExecutor = new MwCommandExecutor();
			//state.set("commandExecutor", mwCommandExecutor.getManager());
		//}
		
		//state = stateManager.get(id);
		//MCommandExecutor commandExecutor = (MCommandExecutor)state.get("commandExecutor");
		
		CommandTokenizer cmdTkn = new CommandTokenizer();
		
		//Reflection reflection = new Reflection();
		CommandSelector cmdSelector = new CommandSelector(MwScriptManager.getManager());
		String[] cmdLines = cmdTkn.getCommandLines((String)params.get("aScript"));
		for(int i=0; i<cmdLines.length; i++){
			Reflection.runMethod(cmdSelector, cmdTkn.getCommandParams(cmdLines[i]));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		/*
		String[] cmdParams = cmdTkn.getCommandParam((String)params.get("script"));
		commandExecutor.initializeMGrid(cmdParams[1]);
		*/
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
		
	}
	
}
