package br.com.dio.loops;
/*
Faça um programa que peça uma nota entre 0 e 10.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido
*/

import java.util.Scanner;

public class ex2Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;

        System.out.println("Digite a nota(Entre 0 a 10): ");
        nota = scan.nextDouble();

        while((nota < 0) || (nota > 10)){
            System.out.println("NOTA INVÁLIDA!");
            System.out.println("Digite novamente a nota(Entre 0 a 10): ");
            nota = scan.nextDouble();

        }
    }
}
