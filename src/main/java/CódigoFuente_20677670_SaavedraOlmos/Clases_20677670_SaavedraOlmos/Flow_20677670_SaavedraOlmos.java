package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceFlow_20677670_SaavedraOlmos;
import java.util.*;

public class Flow_20677670_SaavedraOlmos {
    private int id;
    private String msg;
    private List<Option_20677670_SaavedraOlmos> options;

    public Flow_20677670_SaavedraOlmos(int id, String msg,
                                       List<Option_20677670_SaavedraOlmos> options) {
        this.id = id;
        this.msg = msg;
        this.options = options;
    }

    public int getId() {
        return id;
    }
    
    public void flowAddOption(Option_20677670_SaavedraOlmos newOption) {
    	boolean optionExists = false; 
    	
        for(Option_20677670_SaavedraOlmos op: options){
           if(op.getCode() == newOption.getCode()){
           	optionExists = true; 
           	break; 
           }
        }
        
        if(optionExists == false){
           options.add(newOption);
        }
        
    }
    
    public static List<Flow_20677670_SaavedraOlmos> removeDuplicateFlows(List<Flow_20677670_SaavedraOlmos> flows){
    	List<Flow_20677670_SaavedraOlmos> listFlows = new ArrayList<>();
    	List<Integer> idFlows = new ArrayList<>();
    	
    	for(Flow_20677670_SaavedraOlmos fl: flows){
    	   if(!idFlows.contains(fl.getId())){
    	   	idFlows.add(fl.getId());
    	   	listFlows.add(fl);
    	   }
    	}
    	
    	return listFlows;
    }

    @Override
    public String toString() {
        return "[" +
                id +
                msg +
                options +
                ']';
    }
}
