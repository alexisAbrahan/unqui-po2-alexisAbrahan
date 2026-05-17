package ar.edu.unq.po2.tp3;

public class Rectangulo {
    private int ancho;
    private int alto;
    private Point ubicacion;

    public Rectangulo(int ancho, int alto, Point ubicacion){
        if (ancho < 1) {
            this.ancho = 1;
        } else {
            this.ancho = ancho;
        }

        if (alto < 1) {
            this.alto = 1;
        } else {
            this.alto = alto;
        }

        this.ubicacion = ubicacion;

    }

    public Rectangulo (){
        this.ancho = 1;
        this.alto = 1;
        this.ubicacion = new Point(0,0);
    }
    public int getAncho(){
        return this.ancho;
    }

    public int getAlto(){
        return this.alto;
    }
    public int calcularArea(){
        return this.ancho*this.alto;
    }
    public int calcularPerimetro(){
        return 2*(this.ancho+this.alto);
    }
    public boolean esHorizontal(){
        return this.alto < this.ancho;
    }
}
