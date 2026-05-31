package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Abuela;
import modelo.Arbol;
import modelo.Bosque;
import modelo.Caperucita;
import modelo.Casa;
import modelo.Cesta;
import modelo.Elemento;
import modelo.Lenador;
import modelo.Lobo;
import vista.VentanaPrincipal;

public class ControladorHistoria implements ActionListener {

    private final VentanaPrincipal vista;
    private Bosque bosque;
    private Caperucita caperucita;
    private Lobo lobo;
    private Lenador lenador;
    private Abuela abuela;
    private int pasoHistoria;

    public ControladorHistoria(VentanaPrincipal vista) {
        this.vista = vista;
        this.vista.setControlador(this);
        reiniciarHistoria();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if ("INICIAR".equals(comando)) {
            iniciarHistoria();
        } else if ("SIGUIENTE".equals(comando)) {
            avanzarHistoria();
        } else if ("REINICIAR".equals(comando)) {
            reiniciarHistoria();
        } else if ("MOSTRAR_CESTA".equals(comando)) {
            mostrarCesta();
        } else if ("TOGGLE_LOBO".equals(comando)) {
            cambiarEstadoLobo(vista.isLoboDisfrazado());
        } else if ("ACCION".equals(comando)) {
            ejecutarAccionSeleccionada();
        }
    }

    private void iniciarHistoria() {
        vista.limpiarNarracion();
        vista.agregarNarracion("Había una vez Caperucita y su capa roja bien bonita.");
        vista.agregarNarracion("Su mamá le pidió llevar una cesta a la casa de la abuela.");
        vista.agregarNarracion("El bosque tiene " + bosque.getArboles().size() + " árboles ahora mismo.");
        pasoHistoria = 0;
    }

    private void avanzarHistoria() {
        pasoHistoria++;
        switch (pasoHistoria) {
            case 1:
                vista.agregarNarracion("Caperucita empezó a caminar por el bosque.");
                break;
            case 2:
                vista.agregarNarracion("El lobo apareció entre los árboles y empezó a seguirla.");
                break;
            case 3:
                caperucita.visitarAbuela();
                vista.agregarNarracion("Caperucita llegó a la casa y saludó a su abuela.");
                break;
            case 4:
                lenador.rescatar(abuela, caperucita);
                vista.agregarNarracion("El leñador llegó justo a tiempo y ayudó a todos.");
                break;
            default:
                vista.agregarNarracion("La historia terminó feliz. Puedes reiniciar cuando quieras.");
                break;
        }
    }

    private void mostrarCesta() {
        vista.agregarNarracion(caperucita.getCesta().contenidoComoTexto());
    }

    private void cambiarEstadoLobo(boolean disfrazado) {
        lobo.setDisfrazado(disfrazado);
        if (disfrazado) {
            lobo.disfrazarse();
            vista.agregarNarracion("El lobo se puso disfraz para engañar.");
        } else {
            vista.agregarNarracion("El lobo ya no está disfrazado.");
        }
    }

    private void ejecutarAccionSeleccionada() {
        String accion = vista.getAccionSeleccionada();

        if ("Agregar árbol".equals(accion)) {
            bosque.agregarArbol(new Arbol("Pino"));
            vista.agregarNarracion("Se sembró un árbol nuevo. Ahora hay " + bosque.getArboles().size() + ".");
        } else if ("Cortar árbol".equals(accion)) {
            int cortados = bosque.cortarArboles(1);
            vista.agregarNarracion("Se cortó " + cortados + " árbol. Quedan " + bosque.getArboles().size() + ".");
        } else if ("Visitar abuela".equals(accion)) {
            caperucita.visitarAbuela();
            vista.agregarNarracion("Caperucita visitó a su abuela y la vio más tranquila.");
        } else if ("Rescate del leñador".equals(accion)) {
            lenador.rescatar(abuela, caperucita);
            lenador.abrirLobo(lobo);
            lenador.llenarDePiedras(lobo);
            vista.agregarNarracion("El leñador hizo el rescate y el lobo quedó vencido.");
        } else if ("Entregar cesta".equals(accion)) {
            caperucita.entregarCesta();
            vista.agregarNarracion("Caperucita entregó la cesta a su abuela.");
        }
    }

    private void reiniciarHistoria() {
        crearEscenario();
        vista.limpiarNarracion();
        vista.setLoboDisfrazado(false);
        vista.agregarNarracion("Todo listo para empezar otra vez la historia.");
    }

    private void crearEscenario() {
        bosque = new Bosque();
        bosque.setTamano(120.5);
        bosque.setCasa(new Casa("Al final del bosque"));
        bosque.agregarArbol(new Arbol("Pino"));
        bosque.agregarArbol(new Arbol("Roble"));
        bosque.agregarArbol(new Arbol("Cedro"));

        abuela = new Abuela("Abuelita", 78, "Delicada");

        Cesta cesta = new Cesta();
        cesta.agregarElemento(new Elemento("Pan", "Comida", 0.5));
        cesta.agregarElemento(new Elemento("Jugo", "Bebida", 1));
        cesta.setTieneComida(true);
        cesta.setTieneBebida(true);

        caperucita = new Caperucita("Caperucita", "Roja", cesta, abuela, bosque);
        lobo = new Lobo("Lobo", false);
        lenador = new Lenador("Leñador", true);
        pasoHistoria = 0;
    }
}
