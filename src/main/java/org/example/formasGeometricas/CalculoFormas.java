package org.example.formasGeometricas;

public interface CalculoFormas {

 public static double NUM_PI = 3.14;

    public default void area(){

        //Área círculo: PI * radio ^ 2
        //Área rectángulo: base * altura

    }

    public default void Perimetro(){

        // Perímetro rectángulo: (base + altura) * 2
        //Perímetro círculo: 2 * PI * radio

    }
}
