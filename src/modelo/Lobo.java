package modelo;

public class Lobo extends Personaje {

    private boolean disfrazado;

    public Lobo() {
    }

    public Lobo(String nombre, boolean disfrazado) {
        super(nombre);
        this.disfrazado = disfrazado;
    }

    public void correr() {
    }

    public void disfrazarse() {
        this.disfrazado = true;
    }

    public void enganar(Personaje victima) {
        if (victima != null && victima.getVivo()) {
            victima.morir();
        }
    }

    public boolean getDisfrazado() {
        return disfrazado;
    }

    public void setDisfrazado(boolean disfrazado) {
        this.disfrazado = disfrazado;
    }
}
