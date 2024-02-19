package org.example.cuenta;

import java.util.Random;
import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private double saldoActual;
    private double interes;

    public  Cuenta(int numeroCuenta, long dni, double saldoActual, double interes){
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public Cuenta(){

    }

    //getters

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public long getDni() {
        return this.dni;
    }

    public double getSaldoActual() {
        return this.saldoActual;
    }

    public double getInteres() {
        return this.interes;
    }

    //setters

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    // metodos

    public void crearCuenta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su N° de DNI:");
        this.dni = scanner.nextLong();
        Random random = new Random();
        System.out.println("Su N° de cuenta es: ");
        this.numeroCuenta = random.nextInt(111111);
    }

    public void ingresar(double ingreso){
        this.saldoActual = saldoActual  + ingreso;
        System.out.println("Su nuevo saldo, ahora es de: $" + this.saldoActual);
    }

    public void retirar(double retirar){
        if(retirar > saldoActual){
            System.out.println("Su saldo actual es: $0");
        }else {
            this.saldoActual = saldoActual - retirar;
            System.out.println("Se retiró de la cuenta: $" + retirar);
            System.out.println("Quedan en la cuenta: $" + this.saldoActual);
        }
    }
    public void extraccionRapida(){

        this.saldoActual = saldoActual - (saldoActual * 0.2);
        System.out.println("Quedan en la cuenta: $" + this.saldoActual);

    }
    public void consultarSaldo(){

        System.out.println("Su saldo actual es de: $" + this.saldoActual);

    }

    public void consultarDatos(){

        System.out.println("Su N° de cuenta es: " + this.numeroCuenta);
        System.out.println("Su N° de DNI es: " + this.dni);
        System.out.println("Su saldo es: $" + this.saldoActual);
        System.out.println("El interés es de: $" + this.interes);
    }
}
