package estruct.services;

import java.util.ArrayList;

public class Municipio_Services extends Registrer_Services {
     private ArrayList<Circunscripcion_Services>listaCircunsc;

     public ArrayList<Circunscripcion_Services> getListaCircunsc() {
          return listaCircunsc;
     }

     public void setListaCircunsc(ArrayList<Circunscripcion_Services> listaCircunsc) {
          this.listaCircunsc = listaCircunsc;
     }

     public Municipio_Services(String codigo,String name,ArrayList<Circunscripcion_Services>List){

            super(codigo,name);
            setListaCircunsc(List);


     }

     
    
}
