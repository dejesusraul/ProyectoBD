package estruct.services;

public class Elector_Services {
    private String nombreApellido;
    private String fechaNacimiento;
    private String Direccion;
    private int NumConsc;
    private String voto;

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    public Elector_Services(String nombreApell, String fechaNacimiento, String Direccion, int NumConsc,String voto) {
        setNombreApellido(nombreApell);
        setFechaNacimiento(fechaNacimiento);
        setDireccion(Direccion);
        setNumConsc(NumConsc);
        setVoto(voto);
        

    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getNumConsc() {
        return NumConsc;
    }

    public void setNumConsc(int numConsc) {
        NumConsc = numConsc;
    }

}
