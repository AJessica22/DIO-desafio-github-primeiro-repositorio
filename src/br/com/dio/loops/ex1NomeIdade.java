package br.com.dio.loops;
/*
Faça um programa que leia conjuntos de valores,
o primeiro representando o nome do aluno e o segundo representando sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class ex1NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade = 0;

        while (true){
            System.out.println("Nome: ");
            nome = scan.nextLine();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
    }
}
