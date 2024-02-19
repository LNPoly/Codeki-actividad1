package org.example.formasGeometricas;

public class Rectangulo extends FormasGeometricas implements CalculoFormas{
    private int base;
    private int altura;


    public Rectangulo(int base, int altura){

        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(){

    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void area() {
        CalculoFormas.super.area();
        //Área rectángulo: base * altura

        double areaRectangulo = base * altura;
        System.out.println("El área del Rectángulo es de: " + areaRectangulo + " cm.");
    }

    @Override
    public void Perimetro() {
        CalculoFormas.super.Perimetro();
        //Perímetro rectángulo: (base + altura) * 2
        double perimetroRectangulo = (base + altura) * 2;
        System.out.println("El perímetro del Rectangulo es de: " + perimetroRectangulo + " cm.");
    }
}
