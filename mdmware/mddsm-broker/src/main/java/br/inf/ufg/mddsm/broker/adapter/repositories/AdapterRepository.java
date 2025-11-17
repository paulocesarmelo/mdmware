package br.inf.ufg.mddsm.broker.adapter.repositories;

import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import adapter.Adapter;
import adapter.Components;
import adapter.Function;
import adapter.Mapper;
import adapter.platform.PSResource;
import br.inf.ufg.mddsm.controller.img.DSC;
import br.inf.ufg.mddsm.controller.img.DSEntity;

public class AdapterRepository {

	public static AdapterRepository instance;
	
	public Adapter adapter; 
	
	public Mapper mapper;
	public EList<Components> list;
	
	public AdapterRepository() {}
	
	public AdapterRepository(Mapper mapper) {
		this.mapper = mapper;
		this.list = mapper.getComponentsRelated();
	}
	
	public void setMapper(Mapper mapper) {
		this.mapper = mapper;
	}
	
	public Mapper getMapper() {
		return this.mapper;
	}
	
	public EList<Components> getList() {
		return list;
	}

	public void setList(EList<Components> list) {
		this.list = list;
	}

	public Components getComponentsRelated(DSC dsc) {
		
		DSEntity entity = dsc.getEntity();
		
		EList<Components> list = mapper.getComponentsRelated();
		
		Iterator<Components> it = list.iterator();
		
		while(it.hasNext()) {
			Components comp = it.next();
			
			if(comp.getEntity().getName().equals(entity.getName())) {
				return comp;
			}
		}
		
		return null;
		
	}
	
	public PSResource getResourceRelated(DSC dsc) {
		
		DSEntity entity = dsc.getEntity();
		
		Iterator<Components> it = list.iterator();
		
		while(it.hasNext()) {
			Components comp = it.next();
			
			if(comp.getEntity().getName().equals(entity.getName())) {
				return comp.getResource();
			}
		}
		
		return null;
		
	}
	
	public adapter.domain.DSEntity getEntityRelated(PSResource resource) {
		
		Iterator<Components> it = list.iterator();
		
		while(it.hasNext()) {
			Components comp = it.next();
			
			if(comp.getResource().getName().equals(resource.getName())) {
				return comp.getEntity();
			}
			
		}
		
		return null;
	}
	
	public Function getFunction() {
		return mapper.getFunction();
	}
	
	public String getFunctionBody() {
		return mapper.getFunction().getBody();
	}
	
	public LinkedList<Object> getFunctionParameters(){
		
		LinkedList<Object> params = new LinkedList<Object>();
		
		EList<Object> parameters = mapper.getFunction().getParams();
		
		Iterator<Object> it = parameters.iterator();
		
		while(it.hasNext()) {
			params.add(it.next());
		}
		
		return params;
	}
	
	public static AdapterRepository getInstance(){
		if (instance == null)
			instance = new AdapterRepository();
		return instance;
	}
	
	
}
