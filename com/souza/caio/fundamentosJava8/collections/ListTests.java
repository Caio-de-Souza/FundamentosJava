package com.souza.caio.fundamentosJava8.collections;

import java.util.ArrayList;
import java.util.List;

import com.souza.caio.fundamentosJava8.collections.entity.Usuario;

public class ListTests {
/*
 * Indexada
 * Aceita Repetição
 * É ordenado
 * É indexado
 * Pode ser heterogêneo
 */
	
	public static void test() {
		List<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); //Acessar pelo índice
		
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario);
		}
	}

}
