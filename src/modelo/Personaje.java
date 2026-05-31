package modelo;

public abstract class Personaje {

    private String nombre;
    protected boolean vivo;

    public Personaje() {
        this.vivo = true;
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.vivo = true;
    }

    public void hablar() {
    }

    public void moverse() {
    }

    public void morir() {
        this.vivo = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
