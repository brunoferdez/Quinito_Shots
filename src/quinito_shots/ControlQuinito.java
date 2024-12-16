/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quinito_shots;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author bruno
 */
public class ControlQuinito implements ActionListener {
    private ModeloQuinito modelo;
    private Ventana1Quinito ventana1;
    private Ventana2Quinito ventana2;

    public ControlQuinito(ModeloQuinito modelo, Ventana1Quinito ventana1, Ventana2Quinito ventana2) {
        this.modelo = modelo;
        this.ventana1 = ventana1;
        this.ventana2 = ventana2;
        iniciarListeners(this);
    }

    private void iniciarListeners(ControlQuinito l) {
        ventana1.addActionListenerIniciar(l);
        ventana1.addActionListenerIntroducirApodo(l);
        ventana1.addActionListenerReglas(l);
        ventana2.addActionListenerPuntuacionJugador(l);
        ventana2.addActionListenerPuntuacionOponente(l);
        ventana2.addActionListenerTerminar(l);
        ventana2.addActionListenerLanzar(l);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "INICIAR":
                ventana1.setVisible(false);
                ventana2.setVisible(true);
                break;
        }
    }

    void iniciarControl() {
        ventana1.setTitle(modelo.getTitulo());
        ventana1.setVisible(true);
        ventana2.setVisible(false);
    }
}
