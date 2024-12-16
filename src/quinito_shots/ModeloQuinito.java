/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quinito_shots;

/**
 *
 * @author bruno
 */
public class ModeloQuinito {
    private String Titulo;

    public ModeloQuinito() {
    }

    public ModeloQuinito(String Titulo) {
        this.Titulo = Titulo;
        System.out.println("Inicialdo Modelo");
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
}
