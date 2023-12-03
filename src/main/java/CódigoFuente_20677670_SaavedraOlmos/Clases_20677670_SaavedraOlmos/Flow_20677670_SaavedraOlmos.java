package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import java.util.List;
import CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos.Option_20677670_SaavedraOlmos;

public class Flow_20677670_SaavedraOlmos {
    private int id;
    private String msg;
    private List<Option_20677670_SaavedraOlmos> options;

    public Flow_20677670_SaavedraOlmos(int id, String msg,
                                       List<Option_20677670_SaavedraOlmos> options) {
        this.id = id;
        this.msg = msg;
        this.options = options;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[" +
                id +
                msg +
                options +
                ']';
    }
}
