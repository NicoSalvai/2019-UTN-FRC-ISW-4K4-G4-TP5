package domain.builder;

import domain.bussines.Ciudad;

public final class CiudadBuilder {
    private String nombre;
    private int CP;

    private CiudadBuilder() {
    }

    public static CiudadBuilder aCiudad() {
        return new CiudadBuilder();
    }

    public CiudadBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public CiudadBuilder withCP(int CP) {
        this.CP = CP;
        return this;
    }

    public Ciudad build() {
        return new Ciudad(nombre, CP);
    }
}
