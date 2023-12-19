package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import java.util.*;
import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceUser_20677670_SaavedraOlmos;

public class User_20677670_SaavedraOlmos implements InterfaceUser_20677670_SaavedraOlmos {
    private String nameUser;
    private String userType;
    private List<String> chatHistory = new ArrayList<String>();

    /**
     * Descripción: Constructor de la clase User
     * @param nameUser Nombre del usuario
     * @param userType Tipo de usuario (Administrador o Normal)
     * @return User_20677670_SaavedraOlmos
     * @author: Agustín Saavedra
     */
    public User_20677670_SaavedraOlmos(String nameUser, String userType) {
        this.nameUser = nameUser;
        this.userType = userType;
    }

    /**
     * Descripción: Selector del nombre de un usuario
     * @param No contiene parámetros de entrada.
     * @return String
     * @author: Agustín Saavedra
     */
     
    public String getNameUser(){
    	return nameUser; 
    }
    
    /**
     * Descripción: Selector del tipo de usuario
     * @param No contiene parámetros de entrada.
     * @return String
     * @author: Agustín Saavedra
     */
     
    public String getUserType(){
    	return userType; 
    }
    
   /**
     * Descripción: Selector del chatHistory de un usuario
     * @param No contiene parámetros de entrada.
     * @return List<String>
     * @author: Agustín Saavedra
     */
    
    public List<String> getChatHistory(){
    	return chatHistory;
    }
    
   /**
     * Descripción: Método modificador que agrega un mensaje de conversación en chatHistory
     * @param message Conversación entre usuario y el sistema.
     * @return List<String>
     * @author: Agustín Saavedra
     */
    
    public void addTalkChatHistory(String message){
    	chatHistory.add(message);
    }
    
   /**
     * Descripción: Método que retorna un usuario como String
     * @param No contiene parámetros de entrada
     * @return String
     * @author Agustín Saavedra
     */
    
    @Override
    public String toString(){
    	return "[" + nameUser
    		+ ", " + chatHistory + "]"; 
    }
}
