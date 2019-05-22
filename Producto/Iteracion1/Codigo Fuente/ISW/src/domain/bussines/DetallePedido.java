package domain.bussines;

public class DetallePedido {
    private Producto producto;
    private int cantidad;

    public DetallePedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float calcularParcial(){
        return producto.getPrecio()*cantidad;
    }
    public boolean esProducto(int codigo){
    	return producto.esCodigo(codigo);
    }
}
