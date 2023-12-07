package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import java.util.*;

public class SystemChatbot_20677670_SaavedraOlmos{
    private String name;
    private int initialChatbotCodeLink;
    private List<Chatbot_20677670_SaavedraOlmos> chatbots;
    private List<String> systemUsers = new ArrayList<String>();
    private List<String> loggedUser = new ArrayList<String>();
    
    public SystemChatbot_20677670_SaavedraOlmos(String name, int initialChatbotCodeLink, List<Chatbot_20677670_SaavedraOlmos> chatbots) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = Chatbot_20677670_SaavedraOlmos.removeDuplicateChatbots(chatbots);
    }
	    
    public SystemChatbot(String name, int initialChatbotCodeLink, List<Chatbot_20677670_SaavedraOlmos> chatbots, List<String> systemUsers, 
    List<String> loggedUser) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = Chatbot_20677670_SaavedraOlmos.removeDuplicateChatbots(chatbots);
        this.systemUsers = systemUsers;
        this.loggedUser = loggedUser;
    }	
    
    public void systemAddChatbot(Chatbot_20677670_SaavedraOlmos newChatbot){
    	boolean chatbotExists = false; 
    	
    	for(Chatbot_20677670_SaavedraOlmos cbt: chatbots){
    	   if(cbt.getChatbotID() == newChatbot.getChatbotID()){
    	   	chatbotExists = true; 
    	   	break;
    	   }
    	}
    	
    	if(chatbotExists == false){
    	   chatbots.add(newChatbot);
    	}
    }
    
    public void systemAddUser(User_20677670_SaavedraOlmos newUser){
    	
    	if(!systemUsers.contains(newUser.getName())){
    	    systemUsers.add(newUser.getName());
    	}
    }
    
    public void systemLogin(String user){
    	if(systemUsers.contains(user) && loggedUser.size() < 1){
    	   loggedUser.add(user);
    	}
    }

}
