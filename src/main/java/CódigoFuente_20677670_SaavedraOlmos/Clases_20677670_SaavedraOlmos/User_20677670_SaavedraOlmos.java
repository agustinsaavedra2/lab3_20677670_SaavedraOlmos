package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceUser_20677670_SaavedraOlmos;

public class User_20677670_SaavedraOlmos implements InterfaceUser_20677670_SaavedraOlmos {
    private String nameUser;
    private String userType;

    /**
     * Descripción: Constructor de la clase User
     * @param name
     * @return User_20677670_SaavedraOlmos
     * @author: Agustín Saavedra
     */
    public User_20677670_SaavedraOlmos(String nameUser, String userType) {
        this.nameUser = name;
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
    
    public String getUserType(){
    	return userType; 
    }
}
