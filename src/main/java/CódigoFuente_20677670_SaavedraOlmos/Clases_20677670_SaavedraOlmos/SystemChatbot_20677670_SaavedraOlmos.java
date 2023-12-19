package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import java.util.*;
import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceSystem_20677670_SaavedraOlmos;

public class SystemChatbot_20677670_SaavedraOlmos implements InterfaceSystem_20677670_SaavedraOlmos {
    private String name;
    private int initialChatbotCodeLink;
    private List<Chatbot_20677670_SaavedraOlmos> chatbots;
    private List<User_20677670_SaavedraOlmos> systemUsers = new ArrayList<>();
    private List<String> loggedUser = new ArrayList<String>();

    /**
     * Descripción Constructor de clase SystemChatbot
     * @param name String que corresponde al nombre de un sistema
     * @param initialChatbotCodeLink Entero que corresponde al código de enlace a un chatbot inicial
     * @param chatbots Lista de chatbots que están en un sistema
     * @param currentIDChatbot ID del chatbot actual del sistema durante la interacción con el chatbot
     * @param currentIDFlow ID del flow actual del sistema durante la interacción con el chatbot
     * @return SystemChatbot_20677670_SaavedraOlmos
     * @author Agustín Saavedra
     */
     
    public SystemChatbot_20677670_SaavedraOlmos(String name, int initialChatbotCodeLink, List<Chatbot_20677670_SaavedraOlmos> chatbots) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = Chatbot_20677670_SaavedraOlmos.removeDuplicateChatbots(chatbots);
    }

    /**
     * Descripción Constructor de clase SystemChatbot
     * @param name String que corresponde al nombre de un sistema
     * @param initialChatbotCodeLink Entero que corresponde al código de enlace a un chatbot inicial
     * @param chatbots Lista de chatbots que están en un sistema
     * @param systemUsers Lista de nombres de usuarios registrados en el sistema
     * @param loggedUser  Lista con el nombre del usuario logueado en el sistema
     * @param currentIDChatbot ID del chatbot actual del sistema durante la interacción con el chatbot
     * @param currentIDFlow ID del flow actual del sistema durante la interacción con el chatbot
     * @return SystemChatbot_20677670_SaavedraOlmos
     * @author Agustín Saavedra
     */
     
    public SystemChatbot_20677670_SaavedraOlmos(String name, int initialChatbotCodeLink, List<Chatbot_20677670_SaavedraOlmos> chatbots, List<User_20677670_SaavedraOlmos> systemUsers, List<String> loggedUser) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = Chatbot_20677670_SaavedraOlmos.removeDuplicateChatbots(chatbots);
        this.systemUsers = systemUsers;
        this.loggedUser = loggedUser;
        
    }
    	   
    public String getName(){
    	return name; 
    }
    
    public List<Chatbot_20677670_SaavedraOlmos> getChatbots(){
    	return chatbots; 
    }
    
    public Chatbot_20677670_SaavedraOlmos getChatbotViaID(int idChatbot){
    	for(Chatbot_20677670_SaavedraOlmos cbt: chatbots){
    	   if(cbt.getChatbotID() == idChatbot){
    	      return cbt; 
    	   }	
    	}
    	
    	return null; 
    }
    
    public List<User_20677670_SaavedraOlmos> getSystemUsers(){
    	return systemUsers; 
    }
    
    public List<String> getNameSystemUsers(List<User_20677670_SaavedraOlmos> systemUsers){
    	List<String> nameUsers = new ArrayList<String>();
    	
    	for(User_20677670_SaavedraOlmos user: systemUsers){
    	   nameUsers.add(user.getNameUser());	
    	}
    	
    	return nameUsers;
    }

    /**
     * Descripción: Modficador de sistema que añade un chatbot en base a su id (unicidad)
     * @param newChatbot
     * @return void
     * @author Agustín Saavedra
     */
     
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

    /**
     * Descripción: Modficador de sistema que añade un usuario en base a su nombre (debe ser único)
     * @param newUser
     * @return void
     * @author Agustín Saavedra
     */
    public void systemAddUser(User_20677670_SaavedraOlmos newUser){
    	
    	if(!systemUsers.contains(newUser.getNameUser())){
    	    systemUsers.add(newUser);
    	}
    }

    /**
     * Descripción: Método de sistema que le da acceso a un solo usuario en la lista del usuario logueado (debe estar en la lista de usuarios registrados)
     * @param user
     * @return void
     * @author Agustín Saavedra
     */
     
    public void systemLogin(String user){
    	if(systemUsers.contains(user) && loggedUser.size() < 1){
    	   loggedUser.add(user);
    	}
    }

    /**
     * Descripción: Método de sistema que elimina al usuario de la lista del usuario logueado
     * @param No hay parámetros de entrada
     * @return void
     * @author Agustín Saavedra
     */
     
    public void systemLogout(){
    	loggedUser.clear();
    }
    
    public void systemTalk(String msg){
    	int idChatbot = -1000;
    	int idFlow = -1000;	
    	
    	if(idChatbot == -1000 && idFlow == -1000){
    	   initialSystemTalk(msg, idChatbot, idFlow);  	
    	}
    	else{
    	   conversationSystemTalk(msg, idChatbot, idFlow);	
    	}
    }
    
    public void initialSystemTalk(String msg, int idChatbot, int idFlow){
    	Chatbot_20677670_SaavedraOlmos cbt; 
    	Flow_20677670_SaavedraOlmos fl; 
    	String dialogue; 
    	
    	Date date = new Date();
    	
    	cbt = getChatbotViaID(initialChatbotCodeLink);
    	fl = cbt.getFlowViaID(cbt.getStartFlowID());
    	dialogue = loggedUser.get(0) + ": " + msg + " " + date + "\n" + cbt.getName() + " " + fl.getMsg() + "\n" + fl.getMsgOptions() + " " + date; 
    	for(User_20677670_SaavedraOlmos us: systemUsers){
    	   if(us.getNameUser().equals(loggedUser.get(0))){
    	     us.addTalkChatHistory(dialogue); 	
    	   }	
    	}
    	
    	idChatbot = cbt.getChatbotID();
    	idFlow = fl.getId();
    }
    
    public void conversationSystemTalk(String msg, int idChatbot, int idFlow){
    	Chatbot_20677670_SaavedraOlmos cbt; 
    	Flow_20677670_SaavedraOlmos fl; 
    	String dialogue; 
    	
    	Date date = new Date();
    	
    	cbt = getChatbotViaID(idChatbot);
    	fl = cbt.getFlowViaID(idFlow);
    	
    	for(Option_20677670_SaavedraOlmos op: fl.getOptions()){
    	   if(op.getKeywords().contains(msg) || op.getMessage().contains(msg)){
    	   	idChatbot = op.getChatbotCodeLink();
    		idFlow = op.getInitialFlowCodeLink();
    	   }	
    	}
    	
    	cbt = getChatbotViaID(idChatbot);
    	fl = cbt.getFlowViaID(idFlow);
    	
        dialogue = loggedUser.get(0) + ": " + msg + " " + date + "\n" + cbt.getName() + " " + fl.getMsg() + "\n" + fl.getMsgOptions() + " " + date; 
    	for(User_20677670_SaavedraOlmos us: systemUsers){
    	   if(us.getNameUser().equals(loggedUser.get(0))){
    	     us.addTalkChatHistory(dialogue); 	
    	   }	
    	}
    }
    
    public void systemSynthesis(String userName){
    	String dialogues = "";
    	
    	for(User_20677670_SaavedraOlmos us: systemUsers){
    	   if(us.getNameUser().equals(userName)){
    	   	for(String chat: us.getChatHistory()){
    	   	   dialogues = dialogues.concat(chat).concat("\n");	
    	   	}
    	   }		
    	}
    	
    	System.out.println(dialogues);
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
                name + 
                "," + initialChatbotCodeLink +
                "," + chatbots + "," + systemUsers +
                "," + loggedUser + ']';
    }

}
