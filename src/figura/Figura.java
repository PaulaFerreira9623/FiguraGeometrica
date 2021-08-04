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
public class Figura {

    private String nombre;
    private int numlados;

    public Figura(String nombre, int numlados) {
        this.numlados = numlados;
        this.nombre = nombre;
    }

    public int obtenerLados() {
        return numlados;
    }

    public void fijarLados(int lados) {
        this.numlados = lados;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void fijarNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    public String mostrarDatos() {
        return "\n\033[35mEl " + nombre + " tiene " + numlados + " lados";
    }

}
