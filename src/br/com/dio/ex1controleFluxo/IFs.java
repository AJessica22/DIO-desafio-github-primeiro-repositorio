package br.com.dio.ex1controleFluxo;

import java.util.Scanner;

public class IFs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número do mês:");
        int mes = scan.nextInt();
        nomedoMes(mes);
    }
    
    public static void nomedoMes(int mes){
        int trimestre = 0;
        if ((mes == 1) || (mes == 2) || (mes == 3)){
            trimestre = 1;
        }else if ((mes == 4) || (mes == 5) || (mes == 6)){
            trimestre = 2;
        } else if ((mes == 7) || (mes == 8) || (mes == 9)) {
            trimestre = 3;
        } else if ((mes == 10) || (mes == 11) || (mes == 12)) {
            trimestre = 4;
        }
        if (trimestre == 1){
            if (mes == 1){
                System.out.println("JANEIRO!");
            } else if (mes == 2) {
                System.out.println("FEVEREIRO!");
            } else if (mes == 3) {
                System.out.println("MARÇO!");
            }
        }if (trimestre == 2){
            if (mes == 4){
                System.out.println("ABRIL!");
            } else if (mes == 5) {
                System.out.println("MAIO!");
            } else if (mes == 6) {
                System.out.println("JUNHO!");
            }
        }if (trimestre == 3){
            if (mes == 7){
                System.out.println("JULHO!");
            } else if (mes == 8) {
                System.out.println("AGOSTO!");
            } else if (mes == 9) {
                System.out.println("SETEMBRO!");
            }
        }if (trimestre == 4){
            if (mes == 10){
                System.out.println("OUTUBRO!");
            } else if (mes == 11) {
                System.out.println("NOVEMBRO!");
            } else if (mes == 12) {
                System.out.println("DEZEMBRO!");
            }
        }

        if ((mes == 1) || (mes == 7) || (mes == 12)){
            System.out.println("FÉRIAS");
        }
    }
    
}
