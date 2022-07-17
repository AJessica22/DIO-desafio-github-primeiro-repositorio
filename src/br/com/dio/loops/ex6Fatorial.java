package br.com.dio.loops;
/*
Faça um programa que calcule o fatorial de um número fornecido pelo usuário.
EX:. 5! = 120 (5 x 4 x 3 x 2 x 1)
*/

import java.util.Scanner;

public class ex6Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int fatorial = 1;
        System.out.println("Digite o número desejado: ");
        numero = scan.nextInt();

        for(int i = numero; i >= 1; i--){
            fatorial = fatorial * i;
        }

        System.out.println(numero + "! = " + fatorial);
    }
}
