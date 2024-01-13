package estruct.model;

import java.util.ArrayList;

public class Circunscripcion extends Registrer {

    private Municipio municipio;
    private ArrayList<Colegios> ListColegios;

    public Circunscripcion(String codigo, String Nombre, Municipio municp, ArrayList<Colegios> listColeg) {
        super(codigo, Nombre);
        setMunicipio(municp);
        setListColegios(listColeg);

    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public ArrayList<Colegios> getListColegios() {
        return ListColegios;
    }

    public void setListColegios(ArrayList<Colegios> listColegios) {
        ListColegios = listColegios;
    }

}
