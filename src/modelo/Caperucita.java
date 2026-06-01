package modelo;

public class Caperucita extends Personaje {

    private String colorCapa;
    private Cesta cesta;
    private Abuela abuela;
    private Bosque bosque;

    public Caperucita() {
    }

    public Caperucita(String nombre, String colorCapa, Cesta cesta, Abuela abuela, Bosque bosque) {
        super(nombre);
        this.colorCapa = colorCapa;
        this.cesta = cesta;
        this.abuela = abuela;
        this.bosque = bosque;
    }

    public void visitarAbuela() {
        if (abuela != null) {
            abuela.recibirVisita();
        }
    }

    public void entregarCesta() {
        if (cesta != null) {
            cesta.setTieneComida(false);
            cesta.setTieneBebida(false);
        }
    }

    public String getColorCapa() {
        return colorCapa;
    }

    public void setColorCapa(String colorCapa) {
        this.colorCapa = colorCapa;
    }

    public Cesta getCesta() {
        return cesta;
    }

    public void setCesta(Cesta cesta) {
        this.cesta = cesta;
    }

    public Abuela getAbuela() {
        return abuela;
    }

    public void setAbuela(Abuela abuela) {
        this.abuela = abuela;
    }

    public Bosque getBosque() {
        return bosque;
    }

    public void setBosque(Bosque bosque) {
        this.bosque = bosque;
    }
}
