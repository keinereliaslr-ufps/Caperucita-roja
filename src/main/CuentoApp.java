package main;

import controlador.ControladorHistoria;
import javax.swing.SwingUtilities;
import vista.VentanaPrincipal;

public class CuentoApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal vista = new VentanaPrincipal();
            new ControladorHistoria(vista);
            vista.setVisible(true);
        });
    }
}
