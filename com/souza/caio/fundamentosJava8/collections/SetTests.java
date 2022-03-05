package com.souza.caio.fundamentosJava8.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTests {
/*
 * Não ordenado (por padrão)
 * Não indexado
 * Não aceita repetição
 * Pode ser heterogêneo
 * Set é uma Interface
 * */
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void testGenerics() {
		
		// ---- Misturado --------
		HashSet conjunto = new HashSet<>();
		conjunto.add(true);
		conjunto.add(1.3);
		conjunto.add(2);
		conjunto.add("Teste");
		conjunto.add('a');
		System.out.println("Tamanho: " + conjunto.size());	
		
		Set nums = new HashSet();
		nums.addAll(Arrays.asList(1, 2, 3));
		conjunto.retainAll(nums); //Intercessão com nums
		System.out.println(conjunto);
	}
	
	public static void testOrdenado() {	
		Set<String> listSet = new HashSet<>();
		listSet.add("Ana");
		listSet.add("Carlos");
		listSet.add("Luca");
		listSet.add("Pedro");
		
		for (String nome : listSet) {
			System.out.println(nome);
		}
		
		//Usa algum tipo de ordenação
		SortedSet<String> listSorted = new TreeSet<>();
		listSet.add("Carlos");
		listSet.add("Ana");
		listSet.add("Pedro");
		listSet.add("Luca");
		
		for (String nome : listSorted) {
			System.out.println(nome);
		}
		
		System.out.println(listSorted);
	}
}
