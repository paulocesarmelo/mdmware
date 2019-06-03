package br.inf.ufg.mddsm.controller.script;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.codehaus.commons.compiler.CompileException;

import br.inf.ufg.mddsm.controller.img.DSC;
import br.inf.ufg.mddsm.controller.img.Executor;
import br.inf.ufg.mddsm.controller.img.IntentModel;
import br.inf.ufg.mddsm.controller.img.NaiveGenerator;
import br.inf.ufg.mddsm.controller.img.NaiveSelector;
import br.inf.ufg.mddsm.controller.img.Negotiate;

/*
 * Class responsible for insert operational semantics
 */
public class ScriptProcessor {
	
	List<String> commands;
	
	public void processor(List<String> commands) {
		this.commands = commands;
	}
	
	public void generateIMs() {
	
		Iterator<String> i = commands.iterator();
		
		while(i.hasNext()) {
		
			// Get initial DSC
			DSC initialDSC = new DSC(i.next(), null);
			
			// Find all models which match command
			ArrayList<IntentModel> matchingModels = (new NaiveGenerator()).generateModels(initialDSC);
			
			// Find the best model based on cost
			IntentModel bestModel = (new NaiveSelector()).getBestModel(matchingModels);
		
			printIMs(matchingModels, bestModel);
			
		}
		
	}
	
	public void executeModel(IntentModel bestModel) {
		System.out.println("Beginnning Model Execution");
		
		try {
			(new Executor()).executeModel(bestModel, new Negotiate("System.out.println(\"Precondition executing...\"); return true;"));
		} catch (CompileException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public void printIMs(ArrayList<IntentModel> matchingModels, IntentModel bestModel) {
		// Format and print report
		System.out.println("We generated " + matchingModels.size() + " models");
		System.out.println();
					
		System.out.println();
		if (matchingModels.size() > 0)
			System.out.println("The best model is:\n" + bestModel.prettyPrinter());
			
					
		System.out.println("\n\nThe full list of models:\n");
		for (int k = 0; k < matchingModels.size(); k++){
			System.out.println(matchingModels.get(k).prettyPrinter());
		}
	}
	
	
}
