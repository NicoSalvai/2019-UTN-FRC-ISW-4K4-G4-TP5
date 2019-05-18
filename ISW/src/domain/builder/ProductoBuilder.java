package domain.builder;

import domain.bussines.Producto;

public final class ProductoBuilder {
    private String nombre;
    private float precio;
    private int codigo;

    private ProductoBuilder() {
    }

    public static ProductoBuilder aProducto() {
        return new ProductoBuilder();
    }

    public ProductoBuilder withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder withPrecio(float precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder withCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public Producto build() {
        return new Producto(nombre, precio, codigo);
    }
}
