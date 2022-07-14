package com.dio;

import com.dio.model.Gato;

public class PrimeiroProgramaJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Word");//sysout + ctrl + space
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
	}

}

class Livro {
	public String nome;
	public int numpg;
	
}
