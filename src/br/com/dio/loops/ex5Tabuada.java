package br.com.dio.loops;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
O usuário deve informar de qual número ele  deseja ver a tabuada.
*/
import java.util.Scanner;

public class ex5Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite o número (0 a 10) que deseja ver a tabuada: ");
        numero = scan.nextInt();

        while((numero < 0) || (numero > 10)){
            System.out.println("NÚMERO INVÁLIDO!");
            System.out.println("Digite novamente o número (0 a 10) que deseja ver a tabuada: ");
            numero = scan.nextInt();

        }
        for(int i = 1; i < 11; i++){
            System.out.println(numero + " X " + i + " = " + numero*i);
        }
    }
}
