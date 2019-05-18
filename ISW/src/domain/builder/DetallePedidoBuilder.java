package domain.builder;

import domain.bussines.DetallePedido;
import domain.bussines.Producto;

public final class DetallePedidoBuilder {
    private Producto producto;
    private int cantidad;

    private DetallePedidoBuilder() {
    }

    public static DetallePedidoBuilder aDetallePedido() {
        return new DetallePedidoBuilder();
    }

    public DetallePedidoBuilder withProducto(Producto producto) {
        this.producto = producto;
        return this;
    }

    public DetallePedidoBuilder withCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public DetallePedido build() {
        return new DetallePedido(producto, cantidad);
    }
}
