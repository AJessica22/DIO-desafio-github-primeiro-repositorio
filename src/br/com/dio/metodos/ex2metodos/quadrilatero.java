package br.com.dio.metodos.ex2metodos;

public class quadrilatero {
    public static void area(double lado){
        System.out.println("Área do Quadrado: " + (lado*lado));
    }
    public static void area(double lado1, double lado2){
        System.out.println("Área do Retângulo: " + (lado1*lado2));
    }
    public static void area(double baseMenor, double baseMaior, double altura){
        System.out.println("Área do Trapézio: " + (((baseMenor+baseMaior)*altura)/2));
    }
}
