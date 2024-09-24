public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;


    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }


    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }


    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }


    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirTaza(int cantidad) {
        if (cantidad > this.cantidadActual) {
            this.cantidadActual = 0;
        } else {
            this.cantidadActual -= cantidad;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        if (this.cantidadActual + cantidad > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        } else {
            this.cantidadActual += cantidad;
        }
    }

    public int getCantidadActual() {
        return this.cantidadActual;
    }
}
