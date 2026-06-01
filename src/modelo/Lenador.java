package modelo;

public class Lenador extends Personaje {

    private boolean tieneHacha;

    public Lenador() {
    }

    public Lenador(String nombre, boolean tieneHacha) {
        super(nombre);
        this.tieneHacha = tieneHacha;
    }

    public void rescatar(Abuela abuela, Caperucita caperucita) {
        salvar(abuela);
        salvar(caperucita);
    }

    public void abrirLobo(Lobo lobo) {
        if (lobo != null) {
            lobo.morir();
        }
    }

    public void salvar(Personaje p) {
        if (p != null) {
            p.setVivo(true);
        }
    }

    public void llenarDePiedras(Lobo lobo) {
        if (lobo != null) {
            lobo.setDisfrazado(false);
            lobo.morir();
        }
    }

    public boolean getTieneHacha() {
        return tieneHacha;
    }

    public void setTieneHacha(boolean tieneHacha) {
        this.tieneHacha = tieneHacha;
    }
}
