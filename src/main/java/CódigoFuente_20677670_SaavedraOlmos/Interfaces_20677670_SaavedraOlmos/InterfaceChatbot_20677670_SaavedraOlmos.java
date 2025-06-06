package CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.Flow_20677670_SaavedraOlmos;
import java.util.*;

public interface InterfaceChatbot_20677670_SaavedraOlmos {

    public int getChatbotID();
    public String getName();
    public int getStartFlowID();
    public List<Flow_20677670_SaavedraOlmos> getFlows();
    public Flow_20677670_SaavedraOlmos getFlowViaID(int idFlow);
    public void chatbotAddFlow(Flow_20677670_SaavedraOlmos newFlow);
    public String toString();
    
}
