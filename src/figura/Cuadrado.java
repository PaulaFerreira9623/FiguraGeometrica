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
public class Cuadrado extends Figura {

    private double longitud;

    public Cuadrado(String nombre, int numlados, double longitud) {
        super(nombre, numlados);
        this.longitud = longitud;
    }

    public double obtenerLongitud() {
        return longitud;
    }

    public void fijarLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public double calcularArea() {
        return longitud * longitud;

    }

    @Override
    public double calcularPerimetro() {
        return obtenerLados() * longitud;
    }

    @Override
    public String mostrarDatos() {

        return "\n \033[35mEl " + obtenerNombre() + " tiene " + obtenerLados() + " lados :"
                + "\n Su área es " + calcularArea() + " metros cuadrados" + " y su perimetro es " + calcularPerimetro() + " m";
    }

}
