package estruct.services;

import java.util.ArrayList;

public class CDR_Services extends Registrer_Services {
    private String PresidentName;
    private ArrayList<Integer> Elect;

    public CDR_Services(String codigo, String name, String nombPresidente, ArrayList<Integer> Elect) {
        super(codigo, name);
        setPresidentName(nombPresidente);
        setElect(Elect);

    }

    public String getPresidentName() {
        return PresidentName;
    }

    public void setPresidentName(String presidentName) {
        PresidentName = presidentName;
    }

    public ArrayList<Integer> getElect() {
        return Elect;
    }

    public void setElect(ArrayList<Integer> elect) {
        Elect = elect;
    }

}
