package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double a =  scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double b =  scan.nextDouble();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println(a + " + " + b + " = " + somar);
        System.out.println(a + " - " + b + " = " + subtrair);
        System.out.println(a + " * " + b + " = " + multiplicar);
        System.out.println(a + " / " + b + " = " + dividir);

    }

    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){
        return a / b;
    }
}
