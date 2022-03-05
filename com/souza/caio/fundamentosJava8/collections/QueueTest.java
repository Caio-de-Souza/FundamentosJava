package com.souza.caio.fundamentosJava8.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
/*
 * Implementa fila
 * First in/ First Out (fifo)
 * */
	
	public static void test() {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); //Gera Exception caso não consiga adicionar por a lista estar cheia
		fila.offer("Bia"); //Retorna false caso não consiga adicionar por a lista estar cheia
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		
		System.out.println(fila.peek()); //Retorna o primeiro da fila sem remover. Retorna null se a lista estiver vazia
		System.out.println(fila.element()); //Retorna o primeiro da fila sem remover. Retorna exception se a lista estiver vazia
	
		//fila.remove() //Remove da fila mas lança exception se der erro
		System.out.println(fila.poll());//Pega o primeiro da fila e remove em seguida. Retorna null caso dê erro
	}
}
