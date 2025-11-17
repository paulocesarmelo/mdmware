package br.inf.ufg.mddsm.controller.img;


import java.util.ArrayList;

import br.inf.ufg.mddsm.controller.img.DSC;
import br.inf.ufg.mddsm.controller.img.Procedure;

public class Repository {
	
	private static Repository instance;
	
	ArrayList<Procedure> procedures = new ArrayList<Procedure>();
	ArrayList<Association> associations = new ArrayList<Association>();
	
	public void addProcedure(Procedure procedure){
		procedures.add(procedure);
	}
	
	public void addAssociation(Association association) {
		associations.add(association);
	}
	
	public Procedure getProcedure(String id){
		
		for (int i = 0; i < procedures.size(); i++){
			if (procedures.get(i).getId().equals(id))
				return procedures.get(i);
		}
		return null;
	}
	
	public Association getAssociation(String id){
		
		for (int i = 0; i < associations.size(); i++){
			if (associations.get(i).getId().equals(id))
				return associations.get(i);
		}
		return null;
	}
	
	public ArrayList<Procedure> getAllProcedures(){
		return procedures;
	}
	
	public ArrayList<Association> getAllAssociation(){
		return associations;
	}
	
	public ArrayList<Procedure> getProceduresWithDSC(DSC dsc){
		
		ArrayList<Procedure> matchingProcedures = new ArrayList<Procedure>();
		for (int i = 0; i < procedures.size(); i++){
			if (procedures.get(i).getClassifier().equals(dsc))
				matchingProcedures.add(procedures.get(i));
		}
		return matchingProcedures;
	}
	
	public Association getAssociationWithDSC(DSC dsc){
		
		ArrayList<Association> matchingAssociations = new ArrayList<Association>();
		for (int i = 0; i < associations.size(); i++){
			if (associations.get(i).getClassifier().equals(dsc))
				return associations.get(i);
		}
		return null;
	}
	
	public boolean isEmpty(){
		return procedures.isEmpty();
	}
	
	public static Repository getInstance(){
		if (instance == null)
			instance = new Repository();
		return instance;
	}
}
