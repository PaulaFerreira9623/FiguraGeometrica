/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Paula Andrea Ferreira Mejía
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Figura misFiguras[] = new Figura[5];

        misFiguras[0] = new Cuadrado("Cuadrado", 2, 4.5);
        misFiguras[1] = new Rectangulo("Rectangulo", 4, 2.0, 3.0);
        misFiguras[2] = new Circulo("Círculo", 0, 3);
        misFiguras[3] = new Rombo("Rombo", 4, 5, 10, 6.5);
        misFiguras[4] = new Triangulo("Triángulo", 3, 2.0, 3.0, 4.0);

        for (Figura Figuras : misFiguras) {
            System.out.println(Figuras.mostrarDatos());
        }

    }

}
