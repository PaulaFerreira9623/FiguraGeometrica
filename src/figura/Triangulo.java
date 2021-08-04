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
public class Triangulo extends Figura {

    private double base;
    private double altura;
    private double hipotenusa;

    public Triangulo(String nombre, int numlados, double base, double altura, double hipotenusa) {
        super(nombre, numlados);
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
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

    public double obtenerHipotenusa() {
        return hipotenusa;
    }

    public void fijarHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + hipotenusa;
    }

    @Override
    public String mostrarDatos() {

        return "\n \033[35mEl " + obtenerNombre() + " Rectangulo tiene " + obtenerLados() + " lados :"
                + "\n Su área es " + calcularArea() + " metros cuadrados" + " y su perimetro es " + calcularPerimetro() + " m";

    }

}
