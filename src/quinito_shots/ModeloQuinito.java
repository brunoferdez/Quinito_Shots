/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quinito_shots;

/**
 *
 * @author dam2
 */
public class ModeloQuinito {
    private String reglas = "1. El jugador empieza lanzando los dados y suma la cantidad que"
            + "le ha salido, después le pasa una jugada al oponente de lo que ha sacado,"
            + "le puede decir la verdad o le puede mentir, y el oponete ha de hacer lo mismo"
            + "cuando le toque lanzar los dados.\n"
            + "2. Cada jugada que pase cada uno debe ser mayor que la anterior\n"
            + "3. El jugador gana si le pasa a su oponente una jugada que era verdad y este"
            + "no la cree, y pierde si le pasa lo contrario\n"
            + "4. Las jugadas funcionan de la siguiente jerarquía:\n"
            + "- dados distintos < parejas < quinito\n"
            + "- El quinito se da cuando se saca un 1 y un 2, que es la jugada más alta y"
            + "el que la tenga ganará automáticamente";
    
    public ModeloQuinito() {
    }

    public ModeloQuinito(String reglas) {
        this.reglas = reglas;
        System.out.println("Inicialdo Modelo");
    }

    public String getReglas() {
        return reglas;
    }

    public void setReglas(String reglas) {
        this.reglas = reglas;
    }
}
