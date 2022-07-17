package br.com.dio.loops;
/*
Faça um programa que peça N número inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares
*/

import java.util.Scanner;

public class ex4ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros,numero;
        int count = 0, quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Quantidade: ");
        quantidadeNumeros = scan.nextInt();

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;
            if(numero%2==0) quantidadePares++;
                    else quantidadeImpares++;
        }while(count < quantidadeNumeros);
    }
}
