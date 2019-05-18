package domain.builder;

import domain.bussines.DetallePedido;
import domain.bussines.Direccion;
import domain.bussines.Pago;
import domain.bussines.Pedido;

import java.util.ArrayList;
import java.util.Date;

public final class PedidoBuilder {
    private ArrayList<DetallePedido> detalles;
    private Direccion direccion;
    private Pago pago;
    private Date fechaEntrega;

    private PedidoBuilder() {
    }

    public static PedidoBuilder aPedido() {
        return new PedidoBuilder();
    }

    public PedidoBuilder withDetalles(ArrayList<DetallePedido> detalles) {
        this.detalles = detalles;
        return this;
    }

    public PedidoBuilder withDireccion(Direccion direccion) {
        this.direccion = direccion;
        return this;
    }

    public PedidoBuilder withPago(Pago pago) {
        this.pago = pago;
        return this;
    }

    public PedidoBuilder withFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
        return this;
    }

    public Pedido build() {
        return new Pedido(detalles, direccion, pago, fechaEntrega);
    }
}
