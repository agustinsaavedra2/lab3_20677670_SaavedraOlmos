package CódigoFuente_20677670_SaavedraOlmos.Menú_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.*;
import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceMenu_20677670_SaavedraOlmos;
import java.util.*;

public class Menu_20677670_SaavedraOlmos implements InterfaceMenu_20677670_SaavedraOlmos {
   private int op;
   
   public Menu_20677670_SaavedraOlmos(){
    	this.op = 0; 
    }
    
   public void showSystemsMenu(List<SystemChatbot_20677670_SaavedraOlmos> systems){
    	 for(SystemChatbot_20677670_SaavedraOlmos sys: systems){
    	     System.out.println(sys); 	
         }
    }
    
   public void showCurrentSystem(SystemChatbot_20677670_SaavedraOlmos sys, List<SystemChatbot_20677670_SaavedraOlmos> systems){
    	SystemChatbot_20677670_SaavedraOlmos currentSystem = menuSystemLogin(systems);
    	
    	if(sys == currentSystem){
    	  System.out.println("El sistema actual es " + sys.getName());
    	  System.out.println("\n");
    	  System.out.println(sys.toString());	
    	}
    	else{
    	  System.out.println("El sistema actual es " + currentSystem.getName());
    	  System.out.println("\n");
    	  System.out.println(currentSystem.toString());	
    	}
    }
    
  
    
    
}
