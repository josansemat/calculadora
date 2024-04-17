/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author jaelg
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calculadora CASIO = new Calculadora();

        CASIO.setNumero1(10);
        CASIO.setNumero2(3);

        double resExperado = 3.33; //La respuesta esperada

        if (Math.abs(resExperado - CASIO.division()) <= 0.003) {
            System.out.println("El test de la division es correcto");
        } else {
            System.out.println("El test de la division es incorrecto");
        }

    }

}
