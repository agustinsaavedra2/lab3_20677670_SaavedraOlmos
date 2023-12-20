package CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.*;
import java.util.*;

public interface InterfaceMenu_20677670_SaavedraOlmos {

     public void mainMenu(SystemChatbot_20677670_SaavedraOlmos system, List<SystemChatbot_20677670_SaavedraOlmos> systems);	
     public void showSystemsMenu(List<SystemChatbot_20677670_SaavedraOlmos> systems);
     public void showCurrentSystem(SystemChatbot_20677670_SaavedraOlmos sys, List<SystemChatbot_20677670_SaavedraOlmos> systems);
     public void menuLoginUser(SystemChatbot_20677670_SaavedraOlmos sys); 
     public void adminUserMenu(SystemChatbot_20677670_SaavedraOlmos sys, String nameUser);
     public void addOptionToFlow(SystemChatbot_20677670_SaavedraOlmos sys);
     public void normalUserMenu(SystemChatbot_20677670_SaavedraOlmos sys, String nameUser);
     public void registerUserSystem(SystemChatbot_20677670_SaavedraOlmos sys);
     public SystemChatbot_20677670_SaavedraOlmos menuSystemLogin(List<SystemChatbot_20677670_SaavedraOlmos> systems);
     public void createSystem(SystemChatbot_20677670_SaavedraOlmos sys, List<SystemChatbot_20677670_SaavedraOlmos> systems); 
     
}
