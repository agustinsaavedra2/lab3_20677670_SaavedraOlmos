package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import java.util.*;
import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceChatbot_20677670_SaavedraOlmos;

public class Chatbot_20677670_SaavedraOlmos implements InterfaceChatbot_20677670_SaavedraOlmos {
    private int chatbotID;
    private String name;
    private String welcomeMessage;
    private int startFlowID;
    private List<Flow_20677670_SaavedraOlmos> flows;

    /**
     * Descripción Constructor de clase Chatbot
     * @param chatbotID Entero que corresponde al identificador de un chatbot. Tiene unicidad (no se repite) y se verifica al agregarlo a un sistema
     * @param name String que corresponde al nombre de un chatbot
     * @param welcomeMessage String que corresponde al mensaje de bienvenida de un chatbot
     * @param startFlowID Entero que corresponde al id de un flujo inicial
     * @param flows Lista de flujos que contiene un chatbot
     * @return Chatbot_20677670_SaavedraOlmos
     * @author Agustín Saavedra
     */
     
    public Chatbot_20677670_SaavedraOlmos(int chatbotID, String name, String welcomeMessage, int startFlowID, List<Flow_20677670_SaavedraOlmos> flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowID = startFlowID;
        this.flows = Flow_20677670_SaavedraOlmos.removeDuplicateFlows(flows);
    }

    /**
     * Descripción: Selector de id de un chatbot
     * @param No contiene parámetros de entrada
     * @return int
     * @author Agustín Saavedra
     */
     
    public int getChatbotID() {
        return chatbotID;
    }
    
   /**
     * Descripción: Selector del nombre de un chatbot
     * @param No contiene parámetros de entrada
     * @return String
     * @author Agustín Saavedra
     */
    
    public String getName(){
    	return name; 
    }
    
   /**
     * Descripción: Selector del id del flujo inicial de un chatbot
     * @param No contiene parámetros de entrada
     * @return int
     * @author Agustín Saavedra
     */
    
    public int getStartFlowID(){
    	return startFlowID;
    }
    
   /**
     * Descripción: Selector de los flujos de un chatbot
     * @param No contiene parámetros de entrada
     * @return List<Flow>
     * @author Agustín Saavedra
     */
    
    public List<Flow_20677670_SaavedraOlmos> getFlows(){
    	return flows;
    }
    
   /**
     * Descripción: Método que obtiene un flujo en base a su ID
     * @param idFlow ID del flujo que se va a buscar
     * @return Flow
     * @author Agustín Saavedra
     */
    
    public Flow_20677670_SaavedraOlmos getFlowViaID(int idFlow){
    	for(Flow_20677670_SaavedraOlmos fl: flows){
    	    if(fl.getId() == idFlow){
    	    	return fl;
    	    }	
    	}
    	
    	return null; 
    }

    /**
     * Descripción: Modficador de chatbot que añade un flujo en base a su id (unicidad)
     * @param newFlow
     * @return void
     * @author Agustín Saavedra
     */
    
    public void chatbotAddFlow(Flow_20677670_SaavedraOlmos newFlow){
    	boolean flowExists = false; 
    	
    	for(Flow_20677670_SaavedraOlmos fl: flows){
    	   if(fl.getId() == newFlow.getId()){
    	   	flowExists = true; 
    	   	break; 
    	   }
    	}
    	
    	if(flowExists == false){
    	   flows.add(newFlow);
    	}
    }

    /**
     * Descripción: Método que elimina chatbots duplicados en base a su id
     * @param flows Corresponde a una lista de chatbots en las que se verifica la unicidad de su código
     * @param chatbots
     * @return List<Chatbot_20677670_SaavedraOlmos>
     * @author Agustín Saavedra
     */
     
    public static List<Chatbot_20677670_SaavedraOlmos> removeDuplicateChatbots(List<Chatbot_20677670_SaavedraOlmos> chatbots){
    	List<Chatbot_20677670_SaavedraOlmos> listChatbots = new ArrayList<>();
    	List<Integer> idChatbots = new ArrayList<>();
    	
    	for(Chatbot_20677670_SaavedraOlmos cbt: chatbots){
    	   if(!idChatbots.contains(cbt.getChatbotID())){
    	   	idChatbots.add(cbt.getChatbotID());
    	   	listChatbots.add(cbt);
    	   }
    	}
    	
    	return listChatbots;
    }

    /**
     * Descripción: Método que retorna un chatbot como String
     * @param No contiene parámetros de entrada
     * @return String
     * @author Agustín Saavedra
     */
     
    @Override
    public String toString() {
        return "Chatbot_20677670_SaavedraOlmos{" +
                "chatbotID=" + chatbotID +
                ", name='" + name + '\'' +
                ", welcomeMessage='" + welcomeMessage + '\'' +
                ", startFlowID=" + startFlowID +
                ", flows=" + flows +
                '}';
    }
}
