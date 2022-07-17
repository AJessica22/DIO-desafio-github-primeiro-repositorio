package br.com.dio.arrays;

import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quanta consoantes foram lidas.
Imprima as consoantes.
*/
public class ex2Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] consoantes = new String[6];
        int quantidadeConsoantes = 0, count = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.nextLine();
            if(!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;
        }while(count < consoantes.length);

        for(String consoante : consoantes){
            if (consoante != null){
                System.out.print(consoante + " ");
            }

        }

        System.out.println("\nQuantidade de Consoantes: " + quantidadeConsoantes);

    }
}
