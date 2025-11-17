package br.inf.ufg.mddsm.broker.adapter.repositories;

import java.util.ArrayList;

import adapter.platform.PSResource;
import br.inf.ufg.mddsm.controller.img.DSC;
import br.inf.ufg.mddsm.controller.img.DSEntity;
import br.inf.ufg.mddsm.controller.img.IMRepository;
import br.inf.ufg.mddsm.controller.img.IntentModel;
import psk.Parameter;

public class ResourceRepository {

	private static ResourceRepository instance;
	
	private ArrayList<PSResource> resources = new ArrayList<PSResource>();
	
	public void addResource(PSResource res) {
		resources.add(res);
	}
	
	public ArrayList<PSResource> getAllIntentModels() {
		return resources;
	}

	public void setIntentModels(ArrayList<PSResource> resources) {
		this.resources = resources;
	}
	
	public PSResource getPSResourceByName(String name) {
		for (int i = 0; i < resources.size(); i++){
			if (resources.get(i).getName().equals(name))
				return resources.get(i);
		}
		return null;
	}
	
	public PSResource getPSResourceByUUID(String uuid) {
		for (int i = 0; i < resources.size(); i++){
			if (resources.get(i).getUuid().equals(uuid))
				return resources.get(i);
		}
		return null;
	}
	
	public PSResource getResourceByDSC(DSC dsc) {
		
		DSEntity entity = dsc.getEntity();
		
		AdapterRepository adapterRepo;
		
		return null;
	}
	
	public ArrayList<Parameter> getParameters(PSResource resource){
		
		ArrayList<Parameter> parameters = new ArrayList<Parameter>();
		
		for (int i = 0; i < resources.size(); i++){
			if (resources.get(i).equals(resource))
				parameters.addAll(resources.get(i).getParameters());
				return parameters;
		}
		
		return null;
	}
		
	public boolean isEmpty(){
		return resources.isEmpty();
	}
	
	public static ResourceRepository getInstance(){
		if (instance == null)
			instance = new ResourceRepository();
		return instance;
	}
	
}
