package util;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import domain.builder.CiudadBuilder;
import domain.builder.DetallePedidoBuilder;
import domain.builder.ProductoBuilder;
import domain.bussines.Ciudad;
import domain.bussines.DetallePedido;
import domain.bussines.Producto;

import java.util.ArrayList;

public  class Utilidad {

    public static ArrayList<Ciudad> listaCiudades(){
        ArrayList<Ciudad> lista = new ArrayList<>();

        lista.add(CiudadBuilder.aCiudad().withNombre("Cordoba").withCP(5000).build());
        lista.add(CiudadBuilder.aCiudad().withNombre("Rawson").withCP(1000).build());
        lista.add(CiudadBuilder.aCiudad().withNombre("Rio Tercero").withCP(5850).build());
        lista.add(CiudadBuilder.aCiudad().withNombre("Carlos Paz").withCP(5650).build());
        lista.add(CiudadBuilder.aCiudad().withNombre("De La Furia").withCP(666).build());

        return lista;
    }

    public static ArrayList<Producto> listaProductos(){
        ArrayList<Producto> lista = new ArrayList<>();

        lista.add(ProductoBuilder.aProducto().withNombre("Fideos").withCodigo(1).withPrecio(50.25f).build());
        lista.add(ProductoBuilder.aProducto().withNombre("Manteca").withCodigo(2).withPrecio(25.50f).build());
        lista.add(ProductoBuilder.aProducto().withNombre("Doritos").withCodigo(3).withPrecio(10f).build());
        lista.add(ProductoBuilder.aProducto().withNombre("Cerveza Patagonia").withCodigo(4).withPrecio(100.20f).build());
        lista.add(ProductoBuilder.aProducto().withNombre("Biblia").withCodigo(5).withPrecio(66.6f).build());
        lista.add(ProductoBuilder.aProducto().withNombre("Dignidad").withCodigo(6).withPrecio(0.1f).build());

        return lista;
    }
    public static ArrayList<DetallePedido> listaProd(){
        ArrayList<DetallePedido> lista = new ArrayList<>();

        lista.add(DetallePedidoBuilder.aDetallePedido().withProducto(ProductoBuilder.aProducto().withNombre("Fideos").withCodigo(1).withPrecio(50.25f).build()).withCantidad(1).build());
        lista.add(DetallePedidoBuilder.aDetallePedido().withProducto(ProductoBuilder.aProducto().withNombre("Manteca").withCodigo(2).withPrecio(25.50f).build()).withCantidad(1).build());
        lista.add(DetallePedidoBuilder.aDetallePedido().withProducto(ProductoBuilder.aProducto().withNombre("Doritos").withCodigo(3).withPrecio(10f).build()).withCantidad(1).build());
        lista.add(DetallePedidoBuilder.aDetallePedido().withProducto(ProductoBuilder.aProducto().withNombre("Cerveza Patagonia").withCodigo(4).withPrecio(100.20f).build()).withCantidad(1).build());
        lista.add(DetallePedidoBuilder.aDetallePedido().withProducto(ProductoBuilder.aProducto().withNombre("Dignidad").withCodigo(6).withPrecio(0.1f).build()).withCantidad(0).build());
        return lista;
    }
    public static ArrayList<DetallePedido> listaCarro(){
        ArrayList<DetallePedido> lista = new ArrayList<>();

        lista.add(DetallePedidoBuilder.aDetallePedido().withProducto(ProductoBuilder.aProducto().withNombre("Fideos").withCodigo(1).withPrecio(50.25f).build()).withCantidad(0).build());
        lista.add(DetallePedidoBuilder.aDetallePedido().withProducto(ProductoBuilder.aProducto().withNombre("Manteca").withCodigo(2).withPrecio(25.50f).build()).withCantidad(0).build());
        lista.add(DetallePedidoBuilder.aDetallePedido().withProducto(ProductoBuilder.aProducto().withNombre("Doritos").withCodigo(3).withPrecio(10f).build()).withCantidad(0).build());
        lista.add(DetallePedidoBuilder.aDetallePedido().withProducto(ProductoBuilder.aProducto().withNombre("Cerveza Patagonia").withCodigo(4).withPrecio(100.20f).build()).withCantidad(0).build());
        lista.add(DetallePedidoBuilder.aDetallePedido().withProducto(ProductoBuilder.aProducto().withNombre("Dignidad").withCodigo(6).withPrecio(0.1f).build()).withCantidad(1).build());
        return lista;
    }
    
    
    public static JsonArray pasarAJson(ArrayList<DetallePedido> listaDetalle){

        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject, jsonProducto ;
        for (DetallePedido detallePedido : listaDetalle
        ) {
            jsonObject= new JsonObject() ;
            jsonProducto = new JsonObject() ;
            jsonObject.addProperty("cantidad", detallePedido.getCantidad());
            jsonProducto.addProperty("nombre", detallePedido.getProducto().getNombre());
            jsonProducto.addProperty("precio", detallePedido.getProducto().getPrecio());
            jsonProducto.addProperty("codigo", detallePedido.getProducto().getCodigo());
            jsonObject.add("producto", jsonProducto);
            jsonArray.add(jsonObject);
        }
        return  jsonArray;
    }
    
    
    public static DetallePedido productoAleatorio(){
        return DetallePedidoBuilder.aDetallePedido().withCantidad((int)(Math.random() * 5)).withProducto(listaProductos().get((int)(Math.random() * 5))).build();
    }

    public static JsonArray productoJson(){
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject ;
        for (Producto producto : listaProductos()
                ) {
            jsonObject= new JsonObject() ;
            jsonObject.addProperty("nombre", producto.getNombre());
            jsonObject.addProperty("precio", producto.getPrecio());
            jsonObject.addProperty("codigo", producto.getCodigo());
            jsonArray.add(jsonObject);
        }
        return  jsonArray;
    }

    public static String imagen(){
        return "<img src=\"data:image/jpeg;base64,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\"/>";
    }

}
