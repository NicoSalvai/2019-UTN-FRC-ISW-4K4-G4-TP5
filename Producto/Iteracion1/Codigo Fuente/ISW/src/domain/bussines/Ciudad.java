package domain.bussines;

public class Ciudad {
    private String nombre;
    private int CP;

    public Ciudad(String nombre, int CP) {
        this.nombre = nombre;
        this.CP = CP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }
}
