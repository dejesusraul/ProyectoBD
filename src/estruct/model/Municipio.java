package estruct.model;

import java.util.ArrayList;

public class Municipio extends Registrer {
     private ArrayList<Circunscripcion>listaCircunsc;

     public ArrayList<Circunscripcion> getListaCircunsc() {
          return listaCircunsc;
     }

     public void setListaCircunsc(ArrayList<Circunscripcion> listaCircunsc) {
          this.listaCircunsc = listaCircunsc;
     }

     public Municipio(String codigo,String name,ArrayList<Circunscripcion>List){

            super(codigo,name);
            setListaCircunsc(List);


     }

     
    
}
