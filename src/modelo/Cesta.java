package modelo;

import java.util.ArrayList;

public class Cesta {

    private ArrayList<Elemento> elementos;
    private boolean tieneComida;
    private boolean tieneBebida;

    public Cesta() {
        this.elementos = new ArrayList<>();
    }

    public Cesta(ArrayList<Elemento> elementos, boolean tieneComida, boolean tieneBebida) {
        this.elementos = elementos;
        this.tieneComida = tieneComida;
        this.tieneBebida = tieneBebida;
    }

    public void mostrarContenido() {
    }

    public void agregarElemento(Elemento e) {
        elementos.add(e);
    }

    public boolean quitarElemento(Elemento e) {
        return elementos.remove(e);
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }

    public boolean getTieneComida() {
        return tieneComida;
    }

    public void setTieneComida(boolean tieneComida) {
        this.tieneComida = tieneComida;
    }

    public boolean getTieneBebida() {
        return tieneBebida;
    }

    public void setTieneBebida(boolean tieneBebida) {
        this.tieneBebida = tieneBebida;
    }

    public String contenidoComoTexto() {
        if (elementos.isEmpty()) {
            return "La cesta está vacía.";
        }
        StringBuilder sb = new StringBuilder("En la cesta hay:\n");
        for (Elemento elemento : elementos) {
            sb.append("- ").append(elemento.getNombre())
                    .append(" (").append(elemento.getTipo()).append(")\n");
        }
        return sb.toString();
    }
}
