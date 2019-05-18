package domain.bussines;

public class Pago {
    private Tarjeta tarjeta;
    private float montoEntrega;
    private TipoPago tipoPago;


    public Pago(Tarjeta tarjeta, TipoPago tipoPago) {
        this.tarjeta = tarjeta;
        this.tipoPago = tipoPago;
    }

    public Pago(float montoEntrega, TipoPago tipoPago) {
        this.montoEntrega = montoEntrega;
        this.tipoPago = tipoPago;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public float getMontoEntrega() {
        return montoEntrega;
    }

    public void setMontoEntrega(float montoEntrega) {
        this.montoEntrega = montoEntrega;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }
}
