/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quinito_shots;

/**
 *
 * @author dam2
 */
public class Quinito_Shots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando ...");
        ModeloQuinito modelo = new ModeloQuinito();
        Ventana1Quinito ventana1 = new Ventana1Quinito();
        Ventana2Quinito ventana2 = new Ventana2Quinito();
        ControlQuinito control = new ControlQuinito(modelo, ventana1, ventana2);
        control.iniciarControl();
    }
    
}
