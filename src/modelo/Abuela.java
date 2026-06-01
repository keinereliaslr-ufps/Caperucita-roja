package modelo;

public class Abuela extends Personaje {

    private int edad;
    private String estadoDeSalud;

    public Abuela() {
    }

    public Abuela(String nombre, int edad, String estadoDeSalud) {
        super(nombre);
        this.edad = edad;
        this.estadoDeSalud = estadoDeSalud;
    }

    public void recibirVisita() {
        this.estadoDeSalud = "Contenta";
    }

    public void pedirAyuda() {
        this.estadoDeSalud = "Asustada";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoDeSalud() {
        return estadoDeSalud;
    }

    public void setEstadoDeSalud(String estadoDeSalud) {
        this.estadoDeSalud = estadoDeSalud;
    }
}
