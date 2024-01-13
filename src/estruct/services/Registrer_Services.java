package estruct.services;

public abstract class Registrer_Services {
    protected String codig;
    protected String name;

    public Registrer_Services(String codigo, String name) {
        this.codig = codigo;
        this.name = name;
    }

    public String getCodigo() {
        return codig;
    }

    public String getName() {
        return name;
    }

}
