package CódigoFuente_20677670_SaavedraOlmos.Interfaces_20677670_SaavedraOlmos;

import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.Option_20677670_SaavedraOlmos;
import java.util.*;

public interface InterfaceFlow_20677670_SaavedraOlmos {
    
    public int getId();
    public String getMsg();
    public List<Option_20677670_SaavedraOlmos> getOptions();
    public String getMsgOptions();
    public void flowAddOption(Option_20677670_SaavedraOlmos newOption);
    public String toString();
}
