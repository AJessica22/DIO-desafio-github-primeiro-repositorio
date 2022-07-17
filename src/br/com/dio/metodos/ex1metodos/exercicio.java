package br.com.dio.metodos.ex1metodos;

import java.util.Calendar;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------MENU-----------------------");
        System.out.println(saudacao());
        System.out.println("1. Calcular soma,subtração, divisão e multiplicação");
        System.out.println("2. Calcular valor do empréstimo (taxa de 46%)");
        System.out.println("3. Saudação apartir de um horário dado");
        System.out.println("------------Qual opção deseja escolher?------------");
        int m = scan.nextInt();
        menu(m);
    }

    public static void menu(int m){
        Scanner scan = new Scanner(System.in);
        if (m == 1){
            System.out.println("Digite o primeiro valor:");
            double a = scan.nextDouble();
            System.out.println("Digite o segundo valor:");
            double b = scan.nextDouble();
            calculos(a,b);
        }
        if (m == 2){
            System.out.println("Digite o valor que deseja fazer o empréstimo:");
            double valor = scan.nextDouble();
            emprestimo(valor);
        }
        if (m == 3){
            System.out.println("Digite o horário desejado: ");
            System.out.println("HORA:");
            int hora = scan.nextInt();
            System.out.println("MINUTOS:");
            int min = scan.nextInt();
            System.out.println("SEGUNDOS:");
            int seg = scan.nextInt();
            saudacaoEscolhida(hora,min,seg);
        }
    }

    public static String saudacao(){
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int min = data.get(Calendar.MINUTE);
        int seg = data.get(Calendar.SECOND);
        String saudacao = null;

        if((hora >= 6) && (hora <= 11) && (min <= 59) && (seg <= 59)){
            saudacao = "BOM DIA!";
        }
        if((hora >= 12) && (hora <= 17) && (min <= 59) && (seg <= 59)){
            saudacao = "BOA TARDE!";
        }
        else{
            saudacao = "BOA NOITE!";
        }

        return saudacao;
    }

    public static void calculos(double a, double b){
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " * " + b + " = " + (a*b));
    }

    public static void emprestimo(double valor){
        double taxa = valor * 0.49;
        System.out.println("Valor = " + valor);
        System.out.println("Taxa = " + taxa);
        System.out.println("Valor com taxa = " + (taxa+valor));
    }

    public static void saudacaoEscolhida(int hora, int min, int seg){
        if((hora >= 6) && (hora <= 11) && (min <= 59) && (seg <= 59)){
            System.out.println("BOM DIA!");
        }
        if((hora >= 12) && (hora <= 17) && (min <= 59) && (seg <= 59)){
            System.out.println("BOA TARDE!");
        }
        else{
            System.out.println("BOA NOITE!");
        }
    }

}
