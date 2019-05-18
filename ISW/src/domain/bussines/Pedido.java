package domain.bussines;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private ArrayList<DetallePedido> detalles;
    private Direccion direccion;
    private Pago pago;
    private Date fechaEntrega;

    public Pedido(ArrayList<DetallePedido> detalles, Direccion direccion, Pago pago, Date fechaEntrega) {
        this.detalles = detalles;
        this.direccion = direccion;
        this.pago = pago;
        this.fechaEntrega = fechaEntrega;
    }

    public ArrayList<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
