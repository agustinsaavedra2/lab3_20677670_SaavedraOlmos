package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceUser_20677670_SaavedraOlmos;

public class User_20677670_SaavedraOlmos implements InterfaceUser_20677670_SaavedraOlmos {
    private String name;

    /**
     * Descripción: Constructor de la clase User
     * @param name
     * @return User_20677670_SaavedraOlmos
     * @author: Agustín Saavedra
     */
    public User_20677670_SaavedraOlmos(String name) {
        this.name = name;
    }

    /**
     * Descripción: Selector del nombre de un usuario
     * @param No contiene parámetros de entrada.
     * @return String
     * @author: Agustín Saavedra
     */
     
    public String getName(){
    	return name; 
    }
}
