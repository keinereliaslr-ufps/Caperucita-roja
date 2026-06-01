package modelo;

public class Elemento {

    private String nombre;
    private String tipo;
    private double peso;

    public Elemento() {
    }

    public Elemento(String nombre, String tipo, double peso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
    }

    public void mostrarInfo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
