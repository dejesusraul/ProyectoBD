package estruct.model;

public abstract class Registrer {
    protected String codig;
    protected String name;

    public Registrer(String codigo, String name) {
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
