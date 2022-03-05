package com.souza.caio.fundamentosJava8.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTest {
/*
 * Primeriro a entrar é o último a sair
 * filo
 * */
	
	public static void test() {
		Deque<String> livros = new ArrayDeque<>();
		livros.add("O pequeno príncipe"); //Retorna um booleano
		livros.push("Harry Potter e a pedra filosofal"); //Não tem retorno, mas pode gerar Exception
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.poll());
		livros.pop(); //Remove e retorna o próximo item na lista. Pode gerar exception
	}
}
