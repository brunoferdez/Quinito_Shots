/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quinito_shots;
import java.awt.event.ActionListener;

/**
 *
 * @author dam2
 */
public class Ventana1Quinito extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Ventana1Quinito() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        opciones = new javax.swing.JMenu();
        apodo = new javax.swing.JMenuItem();
        reglas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iniciar.setText("INICIAR");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        opciones.setText("Opciones");

        apodo.setText("Introducir apodo");
        opciones.add(apodo);

        reglas.setText("Reglas");
        opciones.add(reglas);

        jMenuBar1.add(opciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(iniciar)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(iniciar)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem apodo;
    private javax.swing.JButton iniciar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu opciones;
    private javax.swing.JMenuItem reglas;
    // End of variables declaration//GEN-END:variables

    public void addActionListenerIniciar(ActionListener l){
        iniciar.addActionListener(l);
    }
    
    public void addActionListenerIntroducirApodo(ActionListener l){
        apodo.addActionListener(l);
    }
    
    public void addActionListenerReglas(ActionListener l){
        reglas.addActionListener(l);
    }
    
    public void introducirApodo(String operacion) {
        apodo.setText(operacion);
    }
    
}
