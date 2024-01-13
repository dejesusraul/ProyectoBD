package estruct.model;

import java.util.ArrayList;

public class Colegios extends Registrer {

    private String Direccion;
    private Circunscripcion cirunscrp;
    private ArrayList<Elector> presentar;

    public Colegios(String codigo, String name, String Direccion, Circunscripcion cirunsc,
            ArrayList<Elector> ListaPresentar) {
        super(codigo, name);
        setDireccion(Direccion);
        setCirunscrp(cirunsc);;
        setPresentar(ListaPresentar);
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Circunscripcion getCirunscrp() {
        return cirunscrp;
    }

    public void setCirunscrp(Circunscripcion cirunscrp) {
        this.cirunscrp = cirunscrp;
    }

    public ArrayList<Elector> getPresentar() {
        return presentar;
    }

    public void setPresentar(ArrayList<Elector> presentar) {
        this.presentar = presentar;
    }

}
