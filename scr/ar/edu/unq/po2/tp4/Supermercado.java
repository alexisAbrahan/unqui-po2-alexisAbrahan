package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.List;


public class Supermercado   {

    private String nombre;
    private String direcion;
    List<Producto> listaDeProductos = new ArrayList<>();

    public Supermercado(String nombre, String direcion){


    }

    public int getCantidadDeProductos(){
        return  (int) listaDeProductos.stream().count();
    }

    public void agregarProducto(Producto producto){
        listaDeProductos.add(producto);
    }

    public Double getPrecioTotal(){

        return listaDeProductos.stream()
                .mapToDouble(producto -> producto.getPrecio())
                .sum();
    }
}
