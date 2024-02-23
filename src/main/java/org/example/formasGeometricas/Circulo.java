package org.example.formasGeometricas;

public class Circulo extends FormasGeometricas implements CalculoFormas {

    public static double PI;
    private int radio;

    public Circulo(int radio){

        this.radio = radio;
    }

    public Circulo(){

    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void area() {
        CalculoFormas.super.area();
        //Área círculo: PI * radio ^ 2
        double areaCirculo = NUM_PI * radio * radio;
        System.out.println("El área del Círculo es de: " + areaCirculo + " cm.");

    }

    @Override
    public void Perimetro() {
        CalculoFormas.super.Perimetro();
        //Perímetro círculo: 2 * PI * radio

       double perimetroCirculo = 2 * NUM_PI * radio;
        System.out.println("La circunferencia del Círculo es de: " + perimetroCirculo + " cm.");
    }
}
