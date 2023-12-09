package CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.Chatbot_20677670_SaavedraOlmos;
import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.User_20677670_SaavedraOlmos;

public interface InterfaceSystem_20677670_SaavedraOlmos {

    public void systemAddChatbot(Chatbot_20677670_SaavedraOlmos newChatbot);
    public void systemAddUser(User_20677670_SaavedraOlmos newUser);
    public void systemLogin(String user);
    public void systemLogout();
    public String toString();
}
