package com.souza.caio.fundamentosJava8.encapsulamento.casaB;

import com.souza.caio.fundamentosJava8.encapsulamento.casaA.Ana;

public class Maria {

	void testAcessos() {
		Ana sogra = new Ana();
		Pedro marido = new Pedro();
		//System.out.println(sogra.segredo); Não pode pois é private
		//System.out.println(sogra.fazDentroDeCasa); Não pode pois é public somente no package
		//System.out.println(sogra.formaDeFalar); Não pode pois é public somente no package e passado por herança
		System.out.println(sogra.todosSabem);
		//System.out.println(marido.formaDeFalar); Não pode pois somente pode no pacote da classe Ana
	}
}
