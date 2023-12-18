package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import java.util.*;
import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceSystem_20677670_SaavedraOlmos;

public class SystemChatbot_20677670_SaavedraOlmos implements InterfaceSystem_20677670_SaavedraOlmos {
    private String name;
    private int initialChatbotCodeLink;
    private List<Chatbot_20677670_SaavedraOlmos> chatbots;
    private List<String> systemUsers = new ArrayList<String>();
    private List<String> loggedUser = new ArrayList<String>();

    /**
     * Descripción Constructor de clase SystemChatbot
     * @param name String que corresponde al nombre de un sistema
     * @param initialChatbotCodeLink Entero que corresponde al código de enlace a un chatbot inicial
     * @param chatbots Lista de chatbots que están en un sistema
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
     * @return SystemChatbot_20677670_SaavedraOlmos
     * @author Agustín Saavedra
     */
     
    public SystemChatbot_20677670_SaavedraOlmos(String name, int initialChatbotCodeLink, List<Chatbot_20677670_SaavedraOlmos> chatbots, List<String> systemUsers, List<String> loggedUser) {
        this.name = name;
        this.initialChatbotCodeLink = initialChatbotCodeLink;
        this.chatbots = Chatbot_20677670_SaavedraOlmos.removeDuplicateChatbots(chatbots);
        this.systemUsers = systemUsers;
        this.loggedUser = loggedUser;
    }
    
    public String getName(){
    	return name; 
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
    	    systemUsers.add(newUser.getNameUser());
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
