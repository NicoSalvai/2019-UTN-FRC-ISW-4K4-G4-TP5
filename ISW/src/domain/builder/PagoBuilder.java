package domain.builder;

import domain.bussines.Pago;
import domain.bussines.Tarjeta;
import domain.bussines.TipoPago;

public final class PagoBuilder {
    private float montoEntrega;
    private Tarjeta tarjeta;
    private TipoPago tipoPago;

    private PagoBuilder() {
    }

    public static PagoBuilder aPago() {
        return new PagoBuilder();
    }

    public PagoBuilder withMontoEntrega(float montoEntrega) {
        this.montoEntrega = montoEntrega;
        return this;
    }

    public PagoBuilder withTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
        return this;
    }

    public PagoBuilder withTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
        return this;
    }

    public Pago build() {
        Pago pago = new Pago(tarjeta, tipoPago);
        pago.setMontoEntrega(montoEntrega);
        return pago;
    }
}
