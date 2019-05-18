package domain.builder;

import domain.bussines.Ciudad;
import domain.bussines.Direccion;

public final class DireccionBuilder {
    private String calle;
    private int numero;
    private String refeencia;
    private Ciudad ciudad;

    private DireccionBuilder() {
    }

    public static DireccionBuilder aDireccion() {
        return new DireccionBuilder();
    }

    public DireccionBuilder withCalle(String calle) {
        this.calle = calle;
        return this;
    }

    public DireccionBuilder withNumero(int numero) {
        this.numero = numero;
        return this;
    }

    public DireccionBuilder withRefeencia(String refeencia) {
        this.refeencia = refeencia;
        return this;
    }

    public DireccionBuilder withCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public Direccion build() {
        return new Direccion(calle, numero, refeencia, ciudad);
    }
}
