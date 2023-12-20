package CódigoFuente_20677670_SaavedraOlmos.Menú_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.*;
import CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos.InterfaceMenu_20677670_SaavedraOlmos;
import java.util.*;

public class Menu_20677670_SaavedraOlmos implements InterfaceMenu_20677670_SaavedraOlmos {
   private int op;
   
   /**
     * Descripción Constructor de clase Menu
     * @param No posee parámetros de entrada
     * @return Menu_20677670_SaavedraOlmos
     * @author Agustín Saavedra
     */
   
   public Menu_20677670_SaavedraOlmos(){
    	this.op = 0; 
    }
    
   /**
     * Descripción Método que muestra el menú principal
     * @param system Sistema actual
     * @param systems Lista de sistemas de chatbots
     * @return void
     * @author Agustín Saavedra
     */
    
   public void mainMenu(SystemChatbot_20677670_SaavedraOlmos system, List<SystemChatbot_20677670_SaavedraOlmos> systems){
    	int opt; 
    	Scanner inp = new Scanner(System.in);
    	
    	do{
    	    System.out.println("Bienvenido al sistema de simulación de chatbots interactivo");
    	    System.out.println("\n¿Qué opción desea seleccionar?");
    	
    	    System.out.println("1) Visualizar lista de sistemas de chatbots interactivos");
    	    System.out.println("2) Mostrar el sistema actual");
    	    System.out.println("3) Login de Usuario");
    	    System.out.println("4) Registro de Usuario");
    	    System.out.println("5) Login de Sistema");
    	    System.out.println("6) Registro de Sistema");
    	    System.out.println("7) Salir");
    	    
    	    System.out.println("\nIngrese una opción:");
    	    opt = inp.nextInt();
    	    
    	    switch(opt){
    	    	case 1: 
    	    	     System.out.println("\nLa lista de sistemas de chatbots es: ");
    	    	     showSystemsMenu(systems);
    	    	     System.out.println("\n");
    	    	     break; 
    	    	case 2: 
    	    	      showCurrentSystem(system, systems);
    	    	      System.out.println("\n");
    	    	      break;	
    	    	case 3:
    	    	      menuLoginUser(system);
    	    	      System.out.println("\n"); 	
    	    	      break;
    	    	case 4: 
    	    	      registerUserSystem(system);
    	    	      System.out.println("\n");
    	    	      break;
    	    	case 5: 
    	    	      SystemChatbot_20677670_SaavedraOlmos newSystem = menuSystemLogin(systems);
    	    	      String nameSystem = newSystem.getName();
    	    	      system = newSystem;
    	    	      System.out.println("El sistema " + nameSystem + " ha sido logueado de forma exitosa");
    	    	      System.out.println("\n");
    	    	      break; 	
    	    	case 6:
    	    	      createSystem(system, systems);
    	    	      System.out.println("\n");
    	    	      break;
    	    	case 7:
    	    	      break;  
    	    	
    	    	default: 
    	    	      System.out.println("Opción incorrecta. Ingrese otra opción");
    	    	      break; 
    	    	}
    	    
    	} while(opt != 7);
    	
    }
    
   /**
     * Descripción Método que muestra los sistemas creados en el simulador de sistema de chatbots
     * @param systems Lista de sistemas de chatbots
     * @return void
     * @author Agustín Saavedra
     */
    
   public void showSystemsMenu(List<SystemChatbot_20677670_SaavedraOlmos> systems){
    	 for(SystemChatbot_20677670_SaavedraOlmos sys: systems){
    	     System.out.println(sys); 	
         }
    }
    
   /**
     * Descripción Método que muestra los sistemas creados en el simulador de sistema de chatbots
     * @param sys Sistema actual 
     * @param systems Lista de sistemas de chatbots
     * @return void
     * @author Agustín Saavedra
     */
    
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
    
   /**
     * Descripción Método en el que se hace el login de un usuario (sea normal o administrador)
     * @param sys Sistema actual 
     * @return void
     * @author Agustín Saavedra
     */
    
    public void menuLoginUser(SystemChatbot_20677670_SaavedraOlmos sys){
    	Scanner inp = new Scanner(System.in);
    	String nameUser; 
    	
    	System.out.println("Introduce el nombre del usuario: ");
    	nameUser = inp.nextLine();
    	
    	for(User_20677670_SaavedraOlmos user: sys.getSystemUsers()){
    	   if(user.getNameUser().equals(nameUser) && user.getUserType().equals("Admin")){
    	       sys.systemLogin(nameUser);
    	       adminUserMenu(sys, nameUser);	
    	       break;	
    	   }
    	   
    	   if(user.getNameUser().equals(nameUser) && user.getUserType().equals("Normal")){
    	       sys.systemLogin(nameUser);	
    	       normalUserMenu(sys, nameUser);
    	       break;	
    	   } 	
    	}
    }
    
   /**
     * Descripción Método que muestra el menú de un usuario administrador
     * @param sys Sistema actual
     * @param sys nameUser Nombre del usuario logueado en el sistema 
     * @return void
     * @author Agustín Saavedra
     */
    
    public void adminUserMenu(SystemChatbot_20677670_SaavedraOlmos sys, String nameUser){
    	Scanner inp = new Scanner(System.in);
    	int optFunc;
    	
    	do{
    	   System.out.println("Hola Usuario " + nameUser + ", ¿qué desea hacer?");
    	   
    	   System.out.println("1) Crear una opción y agregarlo a un flujo");
    	   System.out.println("2) Crear un flujo y agregarlo a un chatbot");
    	   System.out.println("3) Crear un chatbot y agregarlo a un sistema");
    	   System.out.println("4) System-Talk");
    	   System.out.println("5) System-Synthesis");
    	   System.out.println("6) Cerrar sesión de Usuario");
    	   
    	   optFunc = inp.nextInt();
    	   
    	   switch(optFunc){
    	      case 1: 
    	      	  addOptionToFlow(sys);
    	      	  break;	
    	      case 2:
    	      	  addFlowToChatbot(sys);
    	      	  break;	
    	      case 3:
    	      	  addChatbotToSystem(sys);
    	      	  break;	
    	      case 4:
    	      	  systemTalkMenu(sys);
    	      	  break; 	
    	      case 5: 
    	      	  System.out.println("Sintésis de dialogos del usuario " + nameUser);
    	      	  sys.systemSynthesis(nameUser);
    	      	  break;
    	      case 6:
    	      	  sys.systemLogout();
    	      	  System.out.println("El usuario " + nameUser + " ha cerrado la sesión en el sistema de forma exitosa");
    	      	  break; 
    	      	
    	      default:
    	      	  System.out.println("Opción incorrecta. Intenta otra opción");
    	          break; 	
    	   }	
    	
    	} while(optFunc != 6);
    }
    
   /**
     * Descripción Método en el que se crea una opción y posteriormente se añade a un flujo
     * @param sys Sistema actual
     * @return void
     * @author Agustín Saavedra
     */
    
    public void addOptionToFlow(SystemChatbot_20677670_SaavedraOlmos sys){
    	Scanner inp = new Scanner(System.in);
    	int idOption, chatbotCodeLink, initialFlowCodeLink; 
    	String message; 
    	String keyword1, keyword2, keyword3; 
    	List<String> keywords = new ArrayList<String>();
    	int flowID;
    	
    	System.out.println("ID de la opción a crear: ");
    	idOption = inp.nextInt();
    	System.out.println("Mensaje de la opción a crear: ");
    	inp.nextLine();
    	message = inp.nextLine();
    	System.out.println("Código enlace del chatbot a crear: ");
    	chatbotCodeLink = inp.nextInt();
    	System.out.println("Código enlace del flujo inicial de la opción a crear: ");
    	initialFlowCodeLink = inp.nextInt();
    	
    	System.out.println("Primera palabra clave de la opción a crear: ");
    	inp.nextLine();
    	keyword1 = inp.nextLine();
    	keywords.add(keyword1);
    	System.out.println("Segunda palabra clave de la opción a crear: ");
    	keyword2 = inp.nextLine();
    	keywords.add(keyword2);
    	System.out.println("Tercera palabra clave de la opción a crear: ");
    	keyword3 = inp.nextLine();
    	keywords.add(keyword3);
    	
    	Option_20677670_SaavedraOlmos op = new Option_20677670_SaavedraOlmos(idOption, message, chatbotCodeLink, initialFlowCodeLink, keywords);
    	System.out.println("La opción creada corresponde a: " + op.toString());
    
    	System.out.println("Ingrese el ID del flujo donde se agrega la opción recién creada: ");
    	flowID = inp.nextInt();
    	
    	for(Chatbot_20677670_SaavedraOlmos cbt: sys.getChatbots()){
    	   for(Flow_20677670_SaavedraOlmos fl: cbt.getFlows()){
    	      if(fl.getId() == flowID){
    	      	fl.flowAddOption(op);
    	      }	
    	   }	
    	}
    	
    	System.out.println("La opción " + op.toString() + "ha sido agregada al flujo " + flowID + " con éxito");
    	
    }
    
   /**
     * Descripción Método en el que se crea un flujo y posteriormente se añade a un chatbot
     * @param sys Sistema actual
     * @return void
     * @author Agustín Saavedra
     */
    
    public void addFlowToChatbot(SystemChatbot_20677670_SaavedraOlmos sys){
    	Scanner inp = new Scanner(System.in);
    	int idFlow, idChatbot; 
    	String message; 
    	List<Option_20677670_SaavedraOlmos> options = new ArrayList<Option_20677670_SaavedraOlmos>();
    	
    	System.out.println("Ingrese el ID del flujo a crear: ");
    	idFlow = inp.nextInt();
    	System.out.println("Ingrese el mensaje del flujo a crear: ");
    	inp.nextLine();
    	message = inp.nextLine();
    	
    	Flow_20677670_SaavedraOlmos fl = new Flow_20677670_SaavedraOlmos(idFlow, message, options);
    	System.out.println("El flujo creado corresponde a: " + fl.toString());
    	
    	System.out.println("Ingrese el ID del chatbot donde se agrega el flujo recién creado: ");
    	idChatbot = inp.nextInt();
    	
    	for(Chatbot_20677670_SaavedraOlmos cbt: sys.getChatbots()){
    	   if(cbt.getChatbotID() == idChatbot){
    	   	cbt.chatbotAddFlow(fl);
    	   }	
    	}
    	
    	System.out.println("El flujo " + fl.toString() + "ha sido agregada al chatbot " + idChatbot + " con éxito");
    }
    
   /**
     * Descripción Método en el que se crea un chatbot y posteriormente se añade a un sistema
     * @param sys Sistema actual
     * @return void
     * @author Agustín Saavedra
     */
    
    public void addChatbotToSystem(SystemChatbot_20677670_SaavedraOlmos sys){
    	Scanner inp = new Scanner(System.in);
    	int idChatbot, startFlowID;
    	String name, welcomeMessage, nameSystem; 
    	List<Flow_20677670_SaavedraOlmos> flows = new ArrayList<Flow_20677670_SaavedraOlmos>();
    	
    	System.out.println("Ingrese el ID del chatbot a crear: ");
    	idChatbot = inp.nextInt();
    	System.out.println("Ingrese el nombre del chatbot a crear: ");
    	inp.nextLine();
    	name = inp.nextLine();
    	System.out.println("Ingrese el mensaje de bienvenida del chatbot a crear: ");
    	welcomeMessage = inp.nextLine();
    	System.out.println("Ingrese el id del flujo inicial del chatbot a crear: ");
    	startFlowID = inp.nextInt();
    	
    	Chatbot_20677670_SaavedraOlmos cbt = new Chatbot_20677670_SaavedraOlmos(idChatbot, name, welcomeMessage, startFlowID, flows);
    	
    	System.out.println("Ingrese el nombre del sistema donde se agrega el chatbot recién creado: ");
    	inp.nextLine();
    	nameSystem = inp.nextLine();
    	
    	if(sys.getName().equals(nameSystem)){
    	   sys.systemAddChatbot(cbt);
    	}	
    	
    	System.out.println("El chatbot " + cbt.toString() + "ha sido agregado al sistema " + nameSystem + " con éxito");
    }
    
   /**
     * Descripción Método en el que se muestra el menú systemTalk (para interactuar con un chatbot)
     * @param sys Sistema actual
     * @return void
     * @author Agustín Saavedra
     */
    
    public void systemTalkMenu(SystemChatbot_20677670_SaavedraOlmos sys){
    	Scanner inp = new Scanner(System.in);
    	int opt; 
    	String msg; 
    	
    	do{
    	  System.out.println("Opciones de System-Talk: ");
    	  
    	  System.out.println("1) Conversar con el chatbot");
    	  System.out.println("2) Salir");
    	  
    	  System.out.println("Ingrese una opción: ");
    	  opt = inp.nextInt();
    	  
    	  switch(opt){
    	     case 1: 
    	     	System.out.println("Escriba un mensaje: ");
    	     	inp.nextLine();
    	     	msg = inp.nextLine();
    	     	sys.systemTalk(msg);
    	     	System.out.println(sys.toString());
    	     	break;
    	     case 2: 
    	     	break; 	
    	     default:
    	       System.out.println("Opción incorrecta. Ingrese otra opción.");
    	       break;
    	  }
    	  
    	} while(opt != 2);
    }
    
   /**
     * Descripción Método que muestra el menú de un usuario normal
     * @param sys Sistema actual
     * @param sys nameUser Nombre del usuario logueado en el sistema 
     * @return void
     * @author Agustín Saavedra
     */
    
    public void normalUserMenu(SystemChatbot_20677670_SaavedraOlmos sys, String nameUser){
    	Scanner inp = new Scanner(System.in);
    	int optFunc;
    	
    	do{
    	   System.out.println("Hola Usuario " + nameUser + ", ¿qué desea hacer?");
    	   
    	   System.out.println("1) System-Talk");
    	   System.out.println("2) System-Synthesis");
    	   System.out.println("3) Cerrar sesión de Usuario");
    	   
    	   optFunc = inp.nextInt();
    	   
    	   switch(optFunc){
    	      case 1: 
    	      	  systemTalkMenu(sys);
    	      	  break; 	
    	      case 2:
    	      	  System.out.println("Sintésis de dialogos del usuario " + nameUser);
    	      	  sys.systemSynthesis(nameUser);
    	      	  break;
    	      case 3:
    	      	  sys.systemLogout();
    	      	  System.out.println("El usuario " + nameUser + " ha cerrado la sesión en el sistema de forma exitosa");
    	      	  break; 
    	      default:
    	      	  System.out.println("Opción incorrecta. Intenta otra opción");
    	          break; 	
    	   }	
    	
    	} while(optFunc != 3);
    }
    
   /**
     * Descripción Método que muestra el menú de registro de un usuario
     * @param sys Sistema actual
     * @return void
     * @author Agustín Saavedra
     */
    
    public void registerUserSystem(SystemChatbot_20677670_SaavedraOlmos sys){
    	Scanner inp = new Scanner(System.in);
    	int optUser;
    	User_20677670_SaavedraOlmos newUser; 
    	String nameUser;
    	
    	do{
    	  System.out.println("¿Qué tipo de usuario desea registrar");
    	  System.out.println("1) Tipo administrador");
    	  System.out.println("2) Tipo normal");
    	  System.out.println("3) Salir");
    	   
    	  System.out.println("\nSeleccione su opción: ");
    	  optUser = inp.nextInt(); 	
    	   
    	  switch(optUser){
    	     case 1: 	
    	       System.out.println("Ingrese el nombre del usuario administrador a registrar: ");
    	       inp.nextLine();
    	       nameUser = inp.nextLine();
    	       newUser = new AdminUser_20677670_SaavedraOlmos(nameUser);
    	       sys.systemAddUser(newUser);
    	       System.out.println("El usuario " + newUser.getNameUser() + " ha sido registrado en el sistema con éxito");
    	       System.out.println("\n");
    	       break;
    	       
    	     case 2: 
    	       System.out.println("Ingrese el nombre del usuario normal a registrar: ");
    	       inp.nextLine();
    	       nameUser = inp.nextLine();
    	       newUser = new NormalUser_20677670_SaavedraOlmos(nameUser);
    	       sys.systemAddUser(newUser);
    	       System.out.println("El usuario " + newUser.getNameUser() + " ha sido registrado en el sistema con éxito");
    	       System.out.println("\n");
    	       break;
    	       
    	     case 3: 
    	      	break;
    	      
    	     default: 
    	       System.out.println("Opción incorrecta. Ingrese otra opción");
    	       System.out.println("\n");
    	       break;
    	  } 	
    	
        } while(optUser != 3);
    	
    	   	
     }
     
    /**
     * Descripción Método en el que un sistema es logueado
     * @param systems Lista de sistemas de chatbots
     * @return void
     * @author Agustín Saavedra
     */
     
     public SystemChatbot_20677670_SaavedraOlmos menuSystemLogin(List<SystemChatbot_20677670_SaavedraOlmos> systems){
     	Scanner inp = new Scanner(System.in);
     	String nameSystem; 
     	
     	System.out.println("Nombre del sistema: ");
     	nameSystem = inp.nextLine();
     	
     	for(SystemChatbot_20677670_SaavedraOlmos sys: systems){
     	   if(sys.getName().equals(nameSystem)){
     	      	return sys;
     	   }	
     	}
     	
     	return null; 
     }
     
    /**
     * Descripción Método en el que un sistema es creado
     * @param systems Sistema actual
     * @param systems Lista de sistemas de chatbots
     * @return void
     * @author Agustín Saavedra
     */
     
     public void createSystem(SystemChatbot_20677670_SaavedraOlmos sys, List<SystemChatbot_20677670_SaavedraOlmos> systems){
     	Scanner inp = new Scanner(System.in);
     	String systemName; 
     	int initialChatbotCodeLink;
     	List<Chatbot_20677670_SaavedraOlmos> chatbots; 
     	
     	System.out.println("Ingrese el nombre del sistema a crear: ");
     	systemName = inp.nextLine();
     	System.out.println("Ingrese el código de enlace del chatbot inicial del sistema a crear: ");
     	initialChatbotCodeLink = inp.nextInt();
     	chatbots = new ArrayList<>();
     	
     	SystemChatbot_20677670_SaavedraOlmos newSystem = new SystemChatbot_20677670_SaavedraOlmos(systemName, initialChatbotCodeLink, chatbots);
     	systems.add(newSystem);
     	System.out.println("El sistema " + systemName + " ha sido creado de forma exitosa");
     	mainMenu(sys, systems); 
     	
     }
   

}
  
