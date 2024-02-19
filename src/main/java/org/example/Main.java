package org.example;

import org.example.cuenta.Cuenta;
import org.example.formasGeometricas.Circulo;
import org.example.formasGeometricas.Rectangulo;
import org.example.operacion.Operacion;


public class Main 
{
    public static void main( String[] args ) {

        System.out.println("Ejecicio 1");

        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        operacion.sumar();
        operacion.restar();
        operacion.multiplicar();
        operacion.dividir();

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Ejercicio 2");

        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();
        cuenta.ingresar(10000);
        cuenta.retirar(12000);
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Ejercicio 3");

        Circulo circulo = new Circulo(10);
        circulo.area();
        circulo.Perimetro();
        Rectangulo rectangulo = new Rectangulo(10,6);
        rectangulo.area();
        rectangulo.Perimetro();
    }
}
