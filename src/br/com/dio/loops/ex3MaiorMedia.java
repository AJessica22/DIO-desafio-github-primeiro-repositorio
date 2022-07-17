package br.com.dio.loops;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números
*/

import java.util.Scanner;

public class ex3MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;

        do{
            System.out.println("Digite o número: ");
            numero = scan.nextInt();
            count++;
            soma = soma + numero;


            if(numero > maior) maior = numero;

        }while(count < 5);

        System.out.println("Maior = " + maior);
        System.out.println("Média = " + soma/5);

    }
}
