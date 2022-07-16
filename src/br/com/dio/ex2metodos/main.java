package br.com.dio.ex2metodos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------MENU-----------------------");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Trapézio");
        System.out.println("-------------Qual área deseja calcular?------------");
        int m = scan.nextInt();
        new menu(m);
    }
}
