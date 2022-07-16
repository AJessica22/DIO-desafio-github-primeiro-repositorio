package br.com.dio.ex2metodos;

import java.util.Scanner;

public class menu {
    Scanner scan = new Scanner(System.in);
    quadrilatero q = new quadrilatero();
    public menu(int m) {
        if (m == 1){
            System.out.println("Digite o valor do lado: ");
            double lado = scan.nextDouble();
            q.area(lado);
        }
        if (m == 2){
            System.out.println("Digite o valor do 1º lado: ");
            double lado1 = scan.nextDouble();
            System.out.println("Digite o valor do 2º lado: ");
            double lado2 = scan.nextDouble();
            q.area(lado1, lado2);
        }
        if (m == 3){
            System.out.println("Digite o valor da base menor: ");
            double baseMenor = scan.nextDouble();
            System.out.println("Digite o valor da base maior: ");
            double baseMaior = scan.nextDouble();
            System.out.println("Digite o valor da altura: ");
            double altura = scan.nextDouble();
            q.area(baseMenor, baseMaior, altura);
        }
    }



}
