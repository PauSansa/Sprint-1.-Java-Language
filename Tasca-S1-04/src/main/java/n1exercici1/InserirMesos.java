package n1exercici1;

import java.util.LinkedList;
import java.util.List;

public class InserirMesos {
    private List<String> mesos;

    public InserirMesos() {
        mesos = new LinkedList<String>();
        mesos.add("Gener");
        mesos.add("Febrer");
        mesos.add("Març");
        mesos.add("Abril");
        mesos.add("Maig");
        mesos.add("Juny");
        mesos.add("Juliol");
        mesos.add("Agost");
        mesos.add("Septembre");
        mesos.add("Octubre");
        mesos.add("Novembre");
        mesos.add("Desembre");
    }


    public List<String> getMesos() {
        return mesos;
    }
}
