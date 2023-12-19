package CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.Chatbot_20677670_SaavedraOlmos;
import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.User_20677670_SaavedraOlmos;
import java.util.*;

public interface InterfaceSystem_20677670_SaavedraOlmos {

    public String getName();
    public List<Chatbot_20677670_SaavedraOlmos> getChatbots();
    public Chatbot_20677670_SaavedraOlmos getChatbotViaID(int idChatbot);
    public List<User_20677670_SaavedraOlmos> getSystemUsers();
    public List<String> getNameSystemUsers(List<User_20677670_SaavedraOlmos> systemUsers);
    public void systemAddChatbot(Chatbot_20677670_SaavedraOlmos newChatbot);
    public void systemAddUser(User_20677670_SaavedraOlmos newUser);
    public void systemLogin(String user);
    public void systemLogout();
    public void systemTalk(String msg);
    public void initialSystemTalk(String msg, int idChatbot, int idFlow);
    public void conversationSystemTalk(String msg, int idChatbot, int idFlow);
    public void systemSynthesis(String userName); 
    public String toString();
}
