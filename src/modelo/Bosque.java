package modelo;

import java.util.ArrayList;

public class Bosque {

    private double tamano;
    private ArrayList<Arbol> arboles;
    private Casa casa;

    public Bosque() {
        this.arboles = new ArrayList<>();
    }

    public Bosque(double tamano, ArrayList<Arbol> arboles, Casa casa) {
        this.tamano = tamano;
        this.arboles = arboles;
        this.casa = casa;
    }

    public void describir() {
    }

    public int cortarArboles(int cantidad) {
        int cortados = 0;
        while (cortados < cantidad && !arboles.isEmpty()) {
            arboles.remove(arboles.size() - 1);
            cortados++;
        }
        return cortados;
    }

    public void agregarArbol(Arbol a) {
        arboles.add(a);
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public ArrayList<Arbol> getArboles() {
        return arboles;
    }

    public void setArboles(ArrayList<Arbol> arboles) {
        this.arboles = arboles;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
}
