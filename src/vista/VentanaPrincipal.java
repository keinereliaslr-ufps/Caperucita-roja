package vista;

import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        cmbAcciones.setModel(new DefaultComboBoxModel<>(new String[]{
            "Agregar árbol",
            "Cortar árbol",
            "Visitar abuela",
            "Entregar cesta",
            "Rescate del leñador"
        }));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtNarracion = new javax.swing.JTextArea();
        btnIniciar = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnMostrarCesta = new javax.swing.JButton();
        chkLoboDisfrazado = new javax.swing.JCheckBox();
        cmbAcciones = new javax.swing.JComboBox<>();
        btnAccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caperucita Roja");

        txtNarracion.setColumns(20);
        txtNarracion.setRows(5);
        txtNarracion.setEditable(false);
        jScrollPane1.setViewportView(txtNarracion);

        btnIniciar.setText("Iniciar");
        btnSiguiente.setText("Siguiente");
        btnReiniciar.setText("Reiniciar");
        btnMostrarCesta.setText("Mostrar cesta");
        chkLoboDisfrazado.setText("Lobo disfrazado");
        btnAccion.setText("Hacer acción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnIniciar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSiguiente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnReiniciar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMostrarCesta)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(chkLoboDisfrazado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbAcciones, 0, 210, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAccion)))
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnIniciar)
                        .addComponent(btnSiguiente)
                        .addComponent(btnReiniciar)
                        .addComponent(btnMostrarCesta))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkLoboDisfrazado)
                        .addComponent(cmbAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAccion))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addContainerGap())
        );

        pack();
    }// </editor-fold>

    public void setControlador(ActionListener controlador) {
        btnIniciar.setActionCommand("INICIAR");
        btnSiguiente.setActionCommand("SIGUIENTE");
        btnReiniciar.setActionCommand("REINICIAR");
        btnMostrarCesta.setActionCommand("MOSTRAR_CESTA");
        btnAccion.setActionCommand("ACCION");
        chkLoboDisfrazado.setActionCommand("TOGGLE_LOBO");

        btnIniciar.addActionListener(controlador);
        btnSiguiente.addActionListener(controlador);
        btnReiniciar.addActionListener(controlador);
        btnMostrarCesta.addActionListener(controlador);
        btnAccion.addActionListener(controlador);
        chkLoboDisfrazado.addActionListener(controlador);
    }

    public void agregarNarracion(String texto) {
        txtNarracion.append(texto + "\n");
    }

    public void limpiarNarracion() {
        txtNarracion.setText("");
    }

    public String getAccionSeleccionada() {
        return (String) cmbAcciones.getSelectedItem();
    }

    public boolean isLoboDisfrazado() {
        return chkLoboDisfrazado.isSelected();
    }

    public void setLoboDisfrazado(boolean disfrazado) {
        chkLoboDisfrazado.setSelected(disfrazado);
    }

    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMostrarCesta;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JCheckBox chkLoboDisfrazado;
    private javax.swing.JComboBox<String> cmbAcciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtNarracion;
}
