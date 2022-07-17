package br.com.dio.primeiroPrograma;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", 309);
        int a = 3;
        int b = 5;
        System.out.println("Hello Word " + (a+b));
        System.out.println(gato);
        System.out.println(livro);
    }
}

class Livro{
    private String nome;
    private int numpg;

    public Livro(String nome, int numpg) {
        this.nome = nome;
        this.numpg = numpg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumpg() {
        return numpg;
    }

    public void setNumpg(int numpg) {
        this.numpg = numpg;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpg=" + numpg +
                '}';
    }
}
