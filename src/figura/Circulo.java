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
public class Circulo extends Figura {

    private double radio;

    public Circulo(String nombre, int numlados, double radio) {
        super(nombre, numlados);
        this.radio = radio;
    }

    public double obtenerRadio() {
        return radio;
    }

    public void fijarRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String mostrarDatos() {

        return "\n \033[35mEl " + obtenerNombre() + " tiene " + obtenerLados() + " lados :"
                + "\n Su área es " + calcularArea() + " mm cuadrados" + " y su perimetro es " + calcularPerimetro() + " mm";
    }

}
