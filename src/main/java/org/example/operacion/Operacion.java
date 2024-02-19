package org.example.operacion;

import java.util.Scanner;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) { //método con atributos pasados por parámetros
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() { // método sin atributos pasados por parámetro

    }

    //métodos get de los atributos

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    //métodos set de los atributos

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        this.numero1 = scanner.nextInt();
        System.out.println("Ingrese otro número: ");
        this.numero2 = scanner.nextInt();

    }

    public void sumar() {

        int resultadoSuma = this.numero1 + this.numero2;
        System.out.println("La suma entre los números: " + this.numero1 + " y " + this.numero2 + ", da como resultado: " + resultadoSuma);
    }

    public void restar() {

        int resultadoResta = this.numero1 - this.numero2;
        System.out.println("La resta entre los números: " + this.numero2 + " y " + this.numero1 + ", da como resultado: " + resultadoResta);
    }

    public void multiplicar() {

        if (this.numero1 == 0 || this.numero2 == 0) {

            int resultadoMultiplicacion = this.numero1 * this.numero2;
            System.out.println("Cualquier numero multiplicado por 0 da como resultado" + resultadoMultiplicacion);

        } else {
            int resultadoMultiplicacion = this.numero1 * this.numero2;
            System.out.println("La multiplicacion entre los números: " + this.numero1 + " y " + this.numero2 + ", da como resultado: " + resultadoMultiplicacion);
        }
    }

    public void dividir() {

        if(this.numero1 == 0 || this.numero2 == 0){
            int resultadoDivision = 0;

            System.out.println("¡Error!: no se puede realizar la operación");
            System.out.println("El resultado es: " + resultadoDivision);

        }else {

            int resultadoDivision = this.numero1 / this.numero2;
            System.out.println("La división entre los números: " + this.numero1 + " y " + this.numero2 + ", da como resultado: " + resultadoDivision);
        }
    }
}

