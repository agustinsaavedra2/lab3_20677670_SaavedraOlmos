package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import java.util.*;
import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceOption_20677670_SaavedraOlmos;

public class Option_20677670_SaavedraOlmos implements InterfaceOption_20677670_SaavedraOlmos{
    private int code;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private List<String> keywords;

    /**
     * Descripción Constructor de clase Option
     * @param code Entero que corresponde al código de una opción. Tiene unicidad (no se repite) y se verifica al agregarlo a un flujo
     * @param message String que corresponde al mensaje de una opción
     * @param chatbotCodeLink Entero que corresponde al código de enlace a un chatbot
     * @param initialFlowCodeLink Entero que corresponde al código de enlace a un flujo inicial
     * @param keywords Lista de strings con 0 o más palabras claves
     * @return Option_20677670_SaavedraOlmos
     * @author Agustín Saavedra
     */
     
    public Option_20677670_SaavedraOlmos(int code, String message, int chatbotCodeLink,
                                         int initialFlowCodeLink, List<String> keywords) {
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    /**
     * Descripción: Selector de código de una opción
     * @param No contiene parámetros de entrada
     * @return int 
     * @author Agustín Saavedra
     */
     
    public int getCode() {
        return code;
    }
    
   /**
     * Descripción: Selector de mensaje de una opción
     * @param No contiene parámetros de entrada
     * @return String
     * @author Agustín Saavedra
     */
    
    public String getMessage(){
    	return message;
    }
    
   /**
     * Descripción: Selector de código de enlace del chatbot de una opción
     * @param No contiene parámetros de entrada
     * @return int 
     * @author Agustín Saavedra
     */
    
    public int getChatbotCodeLink(){
    	return chatbotCodeLink;
    }
    
   /**
     * Descripción: Selector de código de enlace del flujo inicial de una opción
     * @param No contiene parámetros de entrada
     * @return int 
     * @author Agustín Saavedra
     */
    
    public int getInitialFlowCodeLink(){
    	return initialFlowCodeLink;
    }
    
   /**
     * Descripción: Selector de las palabras claves de una opción
     * @param No contiene parámetros de entrada
     * @return List<String>
     * @author Agustín Saavedra
     */
    
    public List<String> getKeywords(){
    	return keywords;
    }
    
    /**
     * Descripción: Método que elimina opciones duplicadas en base a su código
     * @param options
     * @return List<Option_20677670_SaavedraOlmos>
     * @author Agustín Saavedra
     */
     
    public static List<Option_20677670_SaavedraOlmos> removeDuplicateOptions(List<Option_20677670_SaavedraOlmos> options){
    	List<Option_20677670_SaavedraOlmos> listOptions = new ArrayList<>();
    	List<Integer> codes = new ArrayList<>();
    	
    	for(Option_20677670_SaavedraOlmos op: options){
    	    if(!codes.contains(op.getCode())){
    	    	codes.add(op.getCode());
    	    	listOptions.add(op);
    	    }
    	}
    	
    	return listOptions;
    }

    /**
     * Descripción: Método que retorna una opción como String
     * @param No contiene parámetros de entrada
     * @return String
     * @author Agustín Saavedra
     */
     
    @Override
    public String toString() {
        return "[" +
                code +
                message +
                chatbotCodeLink +
                initialFlowCodeLink +
                keywords +
                ']';
    }
}
