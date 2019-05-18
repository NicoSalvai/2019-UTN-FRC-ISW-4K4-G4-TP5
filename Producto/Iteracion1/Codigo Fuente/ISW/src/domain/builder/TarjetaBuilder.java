package domain.builder;

import domain.bussines.Tarjeta;

import java.util.Date;

public final class TarjetaBuilder {
    private int CVC;
    private int numero;
    private Date fechaVencimiento;
    private String nombreTitular;

    private TarjetaBuilder() {
    }

    public static TarjetaBuilder aTarjeta() {
        return new TarjetaBuilder();
    }

    public TarjetaBuilder withCVC(int CVC) {
        this.CVC = CVC;
        return this;
    }

    public TarjetaBuilder withNumero(int numero) {
        this.numero = numero;
        return this;
    }

    public TarjetaBuilder withFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
        return this;
    }

    public TarjetaBuilder withNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
        return this;
    }

    public Tarjeta build() {
        return new Tarjeta(CVC, numero, fechaVencimiento, nombreTitular);
    }
}
