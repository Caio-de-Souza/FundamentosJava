package com.souza.caio.fundamentosJava8.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	/*
	 * Chave/Valor Chave não aceita repetição Valor aceita repetição
	 */

	public static void test() {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Caio");
		usuarios.put(2, "Ana");
		usuarios.put(3, "Beto");
		
		usuarios.keySet(); //Lista de chaves
		usuarios.values(); //Lista os valores
		usuarios.entrySet(); //Lista de pares (K e V)
		usuarios.containsKey(1);
		usuarios.containsValue("Beto");
		usuarios.get(1); //findByKey
		
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> record : usuarios.entrySet()) {
			System.out.println("----");
			System.out.println(record.getKey() + " - " + record.getValue());
			System.out.println("----");
		}
	}
}
