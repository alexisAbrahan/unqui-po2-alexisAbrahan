package ar.edu.unq.po2.tp4;

public class Producto {
    protected boolean esPrecioCuidado;
    protected Double precio;
    protected String nombre;


    public Producto(String nombre) {
        this(nombre, 1.0, false);
    }

    public Producto(String nombre, Double precio) {
        this(nombre, precio, false);
    }

    public Producto(String nombre, Double precio, boolean esPrecioCuidado){
        this.esPrecioCuidado = esPrecioCuidado;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getNombre(){
        return (this.nombre);
    }

    public Double getPrecio(){
        return (this.precio);
    }

    public Boolean esPrecioCuidado(){
        return (this.esPrecioCuidado);
    }

    public void aumentarPrecio(Double aumento){
        this.precio = precio + aumento;
    }
}