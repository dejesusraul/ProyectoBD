package estruct.services;

public class Parte_Services {
    private String NumPart;
    private String HoraFecha;
    private int CantidElectVoto;
    private int CantElectElim;
    private int CantElectAdd;
    private int CantTotElect;

    public Parte_Services(String numPart,String HoraFecha,int cantElectVoto,int CantElectElim,int cantElectAdd,int CantiTotElect){
    this.NumPart=numPart;
    this.HoraFecha=HoraFecha;
    this.CantidElectVoto=cantElectVoto;
    this.CantElectElim=CantElectElim;
    this.CantElectAdd=cantElectAdd;
    this.CantTotElect=CantiTotElect;

    }



    public void setNumPart(String numPart) {
        NumPart = numPart;
    }

    public void setHoraFecha(String horaFecha) {
        HoraFecha = horaFecha;
    }

    public void setCantidElectVoto(int cantidElectVoto) {
        CantidElectVoto = cantidElectVoto;
    }

    public void setCantElectElim(int cantElectElim) {
        CantElectElim = cantElectElim;
    }

    public void setCantElectAdd(int cantElectAdd) {
        CantElectAdd = cantElectAdd;
    }

    public void setCantTotElect(int cantTotElect) {
        CantTotElect = cantTotElect;
    }

    

    public String getNumpart(){
        return NumPart;
    }

    public String getHoraFecha(){
        return HoraFecha;
    }

    public int getCantidElectVoto(){
        return CantidElectVoto;
    }

    public int getCantElectElim(){
        return CantElectElim;
    }

    public int getCantElectAdd(){
        return CantElectAdd;
    }

    public int getCantTotElect(){
        return CantTotElect;
    }

    
}
