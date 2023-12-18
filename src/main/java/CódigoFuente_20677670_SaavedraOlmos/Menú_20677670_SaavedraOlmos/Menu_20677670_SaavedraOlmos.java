package CódigoFuente_20677670_SaavedraOlmos.Menu_20677670_SaavedraOlmos;

public class Menu_20677670_SaavedraOlmos {
   private int op;
   
   public Menu(){
    	this.op = 0; 
    }
    
   public void showSystemsMenu(List<SystemChatbot> systems){
    	 for(SystemChatbot sys: systems){
    	     System.out.println(sys); 	
         }
    }
    
   public void showCurrentSystem(SystemChatbot sys, List<SystemChatbot> systems){
    	SystemChatbot currentSystem = menuSystemLogin(systems);
    	
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
