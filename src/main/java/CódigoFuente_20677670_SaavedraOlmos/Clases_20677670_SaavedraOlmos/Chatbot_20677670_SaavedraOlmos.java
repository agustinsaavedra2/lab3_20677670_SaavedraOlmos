package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import java.util.*;
import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceChatbot_20677670_SaavedraOlmos;

public class Chatbot_20677670_SaavedraOlmos {
    private int chatbotID;
    private String name;
    private String welcomeMessage;
    private int startFlowID;
    private List<Flow_20677670_SaavedraOlmos> flows;

    public Chatbot_20677670_SaavedraOlmos(int chatbotID, String name, String welcomeMessage, int startFlowID, List<Flow_20677670_SaavedraOlmos> flows) {
        this.chatbotID = chatbotID;
        this.name = name;
        this.welcomeMessage = welcomeMessage;
        this.startFlowID = startFlowID;
        this.flows = Flow_20677670_SaavedraOlmos.removeDuplicateFlows(flows);
    }

    public int getChatbotID() {
        return chatbotID;
    }
    
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
