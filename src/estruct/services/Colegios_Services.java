package estruct.services;

import java.util.ArrayList;

public class Colegios_Services extends Registrer_Services {

    private String Direccion;
    private Circunscripcion_Services cirunscrp;
    private ArrayList<Elector_Services> presentar;

    public Colegios_Services(String codigo, String name, String Direccion, Circunscripcion_Services cirunsc,
            ArrayList<Elector_Services> ListaPresentar) {
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

    public Circunscripcion_Services getCirunscrp() {
        return cirunscrp;
    }

    public void setCirunscrp(Circunscripcion_Services cirunscrp) {
        this.cirunscrp = cirunscrp;
    }

    public ArrayList<Elector_Services> getPresentar() {
        return presentar;
    }

    public void setPresentar(ArrayList<Elector_Services> presentar) {
        this.presentar = presentar;
    }

}
