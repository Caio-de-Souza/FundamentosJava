package com.souza.caio.fundamentosJava8.encapsulamento.casaA;

import com.souza.caio.fundamentosJava8.encapsulamento.Pessoa;

public class Ana {
	
	private String segredo;
	String fazDentroDeCasa;
	protected String formaDeFalar;
	public String todosSabem;
	
	void testAcessos() {
		Pessoa pessoa = new Pessoa();
		//System.out.println(pessoa.andar); Não tem permissão
	}
}
