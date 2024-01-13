package estruct.services;

import java.util.ArrayList;

public class Circunscripcion_Services extends Registrer_Services {

    private Municipio_Services municipio;
    private ArrayList<Colegios_Services> ListColegios;

    public Circunscripcion_Services(String codigo, String Nombre, Municipio_Services municp, ArrayList<Colegios_Services> listColeg) {
        super(codigo, Nombre);
        setMunicipio(municp);
        setListColegios(listColeg);

    }

    public Municipio_Services getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio_Services municipio) {
        this.municipio = municipio;
    }

    public ArrayList<Colegios_Services> getListColegios() {
        return ListColegios;
    }

    public void setListColegios(ArrayList<Colegios_Services> listColegios) {
        ListColegios = listColegios;
    }

}
