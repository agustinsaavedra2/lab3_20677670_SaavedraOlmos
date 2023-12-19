package CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos;

import java.util.*;

public interface InterfaceUser_20677670_SaavedraOlmos {

    public String getNameUser();
    public String getUserType();
    public List<String> getChatHistory();
    public void addTalkChatHistory(String message);
    public String toString();
}
