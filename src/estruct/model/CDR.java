package estruct.model;

import java.util.ArrayList;

public class CDR extends Registrer {
    private String PresidentName;
    private ArrayList<Integer> Elect;

    public CDR(String codigo, String name, String nombPresidente, ArrayList<Integer> Elect) {
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
