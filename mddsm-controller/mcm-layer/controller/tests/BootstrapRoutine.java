package controller.tests;

import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.model.UsesEventListener;


public class BootstrapRoutine implements UsesEventListener {

	private MwMainManager mwMainMananger;
	private MwScriptManager mwScriptManager;
	private MwCommandExecutor mwCommandExecutor;
	private Broker broker;
	
	
	public static void main(String[] args) {
		BootstrapRoutine manager = new BootstrapRoutine();
		manager.init();
	}
	
	public void init(){
		//mwMainMananger = new MwMainManager();
		//mwScriptManager = new MwScriptManager();
		//mwCommandExecutor = new MwCommandExecutor();
		broker = new Broker();
		String abs = "abs";
		broker.getManager().start(abs);
		broker.getManager().start(abs);
	}

	@Override
	public void use(SignalInstance event) {
		System.out.println("Signal received: " + event.toString());
	}

}
