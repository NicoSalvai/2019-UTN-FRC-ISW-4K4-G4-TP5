package domain.bussines;

public class Direccion {
    private String calle;
    private int numero;
    private String refeencia;
    private Ciudad ciudad;

    public Direccion(String calle, int numero, String refeencia, Ciudad ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.refeencia = refeencia;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRefeencia() {
        return refeencia;
    }

    public void setRefeencia(String refeencia) {
        this.refeencia = refeencia;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
