package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import java.util.*;
import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceFlow_20677670_SaavedraOlmos;

public class Flow_20677670_SaavedraOlmos implements InterfaceFlow_20677670_SaavedraOlmos {
    private int id;
    private String msg;
    private List<Option_20677670_SaavedraOlmos> options;

    /**
     * Descripción Constructor de clase Flow
     * @param id Entero que corresponde al identificador de una opción. Tiene unicidad (no se repite) y se verifica al agregarlo a un   chatbot
     * @param msg String que corresponde al mensaje de un flujo
     * @param options Lista de opciones que contiene el flujo
     * @return Flow_20677670_SaavedraOlmos
     * @author Agustín Saavedra
     */
     
    public Flow_20677670_SaavedraOlmos(int id, String msg,
                                       List<Option_20677670_SaavedraOlmos> options) {
        this.id = id;
        this.msg = msg;
        this.options = Option_20677670_SaavedraOlmos.removeDuplicateOptions(options);
    }

    /**
     * Descripción: Selector de id de un flujo
     * @param No contiene parámetros de entrada
     * @return int
     * @author Agustín Saavedra
     */
     
    public int getId() {
        return id;
    }

    /**
     * Descripción: Modficador de flujo que añade una opción en base a su código (unicidad)
     * @param newOption
     * @return void
     * @author Agustín Saavedra
     */
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

    /**
     * Descripción: Método que elimina flujos duplicados en base a su id
     * @param flows: Corresponde a una lista de flujos en las que se verifica la unicidad de su código
     * @return List<Flow_20677670_SaavedraOlmos>
     * @author Agustín Saavedra
     */
     
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

    /**
     * Descripción: Método que retorna un flujo como String
     * @param No contiene parámetros de entrada
     * @return String
     * @author Agustín Saavedra
     */
    
    @Override
    public String toString() {
        return "[" +
                id +
                msg +
                options +
                ']';
    }
}
