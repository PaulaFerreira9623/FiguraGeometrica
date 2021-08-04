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
public class Rombo extends Figura {

    private double diagonalMayor;
    private double diagonalMenor;
    private double longitud;

    public Rombo(String nombre, int numlados, double diagonalMayor, double diagonalMenor, double longitud) {
        super(nombre, numlados);
        this.diagonalMayor=diagonalMayor;
        this.diagonalMenor=diagonalMenor;
        this.longitud=longitud;
    }

    public double obtenerDiagonalMayor() {
        return diagonalMayor;
    }

    public void fijarDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public double obtenerDiagonalMenor() {
        return diagonalMenor;
    }

    public void fijarDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double obtenerLongitud() {
        return longitud;
    }

    public void fijarLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor)/2;
    }

    @Override
    public double calcularPerimetro() {
        return obtenerLados() * longitud;
    }

    @Override
    public String mostrarDatos() {

        return "\n \033[35m El " + obtenerNombre() + " tiene " + obtenerLados() + " lados :"
                + "\n Su área es " + calcularArea() + " metros cuadrados"+ " y su perimetro es " + calcularPerimetro()+" m";
    }

}
