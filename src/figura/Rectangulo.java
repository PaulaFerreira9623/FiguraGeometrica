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
public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(String nombre, int numlados, double base, double altura) {
        super(nombre, numlados);
        this.base = base;
        this.altura = altura;

    }

    public double obtenerBase() {
        return base;
    }

    public void fijarBase(double base) {
        this.base = base;
    }

    public double obtenerAltura() {
        return altura;
    }

    public void fijarAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    @Override
    public String mostrarDatos() {

        return "\n \033[35mEl " + obtenerNombre() + " tiene " + obtenerLados() + " lados :"
                + "\n Su área es " + calcularArea() + " metros cuadrados" + " y su perimetro es " + calcularPerimetro() + " m";
    }

}
