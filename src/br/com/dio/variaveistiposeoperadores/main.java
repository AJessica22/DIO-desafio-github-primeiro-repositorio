package br.com.dio.variaveistiposeoperadores;

public class main {
    public static void main(String[] args) {

        System.out.println("Pré e pos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
        System.out.println("Casting ou conversões");
        casting();


    }

    private static void variaveisTipos(){
        //Boas práticas:
        int i, I = 10, quantidadeProduto;
        final int j = 10, NUMERO_TENTATIVAS = 5;
        //Funcionam mas não são boas práticas:
        int _1a, $aq, asrn24678md, asrn2$4678_md = 10, QuantidadeProduto, NUMEROS_TENTATIVAS = 5, qtdProd;
        final int numeroTentativas = 5;
        //Não funcionam:
        //int 1a,asrn246 78md, asrn2$46%78_md = 10;

        //Tipo numeral:
        byte b1 = -128, b2 = 127;
        //byte b3 = 128; erro pois passa do limite do byte
        short s1 = -32768, s2 = 32767;
        //short s3 = 32768; erro pois passa do limite do short
        int i1 = -2147483648, i2 = 2147483647;
        //int i3 = 10000000000; erro pois passa do limite do int
        long l1 = -9223372036854775808L, l2 = 9223372036854775807L;
        //long l3 = 10000000000000000000000; erro pois passa do limite do long e esta sem o L
        float f1 = 10.68F;
        //float f2 = 10.68; erro pois falta o f
        double d1 = 54.32d;
        double d2 = 53.23;

        //Tipo textual:
        char c1 = 'T';
        char c2 = '\u0084';
        //char c3 = "Tm" erro por causa das aspas e por causa de ter mais de uma letra
        String st1 = "Fulano", st2 = "Cicrano", dt = "01/01/1111";

        //Tipo lógico:
        boolean bo1 = true, bo2 = false;
    }

    private static void prePos(){
        int k = 10;
        int i = ++k;
        int j = k--;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }

    private static void aritmetico(){
        int a = 10, b = 20, c = 30, d = 40, e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("a + b = " + r1);
        System.out.println("c - a = " + r2);
        System.out.println("d * b = " + r3);
        System.out.println("e / a = " + r4);
        System.out.println("c % b = " + r5);
    }

    private static void atribuicao(){
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5F;
        double d = f;

        System.out.println("d = " + d);

        i += 5;
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 2;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("k = " + k);

        i = k = j;

        System.out.println("i = " + i);
        System.out.println("k = " + k);

    }

    private static void precedencia(){
        int i = 10, j = 20, k = 30;

        int a = i++ + --j * k;

        System.out.println(i + "++ + --" + j + " * " + k + " = " + a);
        System.out.println("i = " + i);

        int b = k / --i % 3 + 1;
        System.out.println(k + "/ --" + i + " % 3 + 1 = " + b);
        System.out.println("i = " + i);

        int c = 2;
        c *= i += 5;
        System.out.println("c *= i += 5: " + c);
    }

    private static void casting(){
        //downcasting quando converte o tipo da variavel para uma capacidade menor da atual
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        //upcasting quando converte o tipo da variavel para uma capacidade maior da atual
        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;

        double d1;
        float f1 = 10.5F;
        d1 = f1;

        float f2, f3;
        double d2 = 100000.58d;
        double d3 = 10000000000000000000000000000000000000000000000000000000000000000000000000000000000.58d;
        f2 = (float) d2;
        f3 = (float) d3;

        int i4;
        float f4 = 11.5978F;
        i4 = (int) f4;

        System.out.println(s1 + " -> b1 = " + b1);
        System.out.println(i1 + " -> l1 = " + l1);
        System.out.println(i2 + " -> l2 = " + l2);
        System.out.println(i3 + " -> l3 = " + l3);
        System.out.println(d1 + " -> f1 = " + f1);
        System.out.println(f2 + " -> d2 = " + d2);
        System.out.println(f3 + " -> d3 = " + d3);
        System.out.println(i4 + " -> f4 = " + f4);
    }
}
