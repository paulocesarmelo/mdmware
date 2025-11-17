package br.inf.ufg.mddsm.broker.adapter.api;

import psk.CommAPIEnum;
import psk.Communication;

public class CommAPIFactory {
	
	//param element from model ECommunication
	CommAPI createCommApi(Communication com) {
		
		CommAPI api = null;
		
		switch(com.getApi().getValue()) {
			case CommAPIEnum.REST_VALUE:
				api = new RestAPI();
				break;
			case CommAPIEnum.GRAPHQL_VALUE:
				break;
			default:
				break;
		}
		
		return api;
		
	}
	
}
