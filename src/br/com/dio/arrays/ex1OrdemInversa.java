package br.com.dio.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa
*/

public class ex1OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {0,-16,74,-8,2};
        int count = 0;

        System.out.println("Vetor: ");

        while (count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println(" ");
        System.out.println("Vetor Inverso: ");
        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
