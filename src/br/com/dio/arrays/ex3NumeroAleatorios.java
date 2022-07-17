package br.com.dio.arrays;
/*
Faça um programa que leia 20 números inteiros aleatórios(Entre 0 e 100) armazene-os num vetor.
Ao final mostre os número e seus sucessores.
*/

import java.util.Random;

public class ex3NumeroAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }
        System.out.println("Números aleatórios e seus sucessores:");

        for (int n : numAleatorios) {
            System.out.println(n + " - " + (n+1));
        }
    }
}
