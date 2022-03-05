package com.souza.caio.fundamentosJava8.encapsulamento.casaA;

import com.souza.caio.fundamentosJava8.encapsulamento.casaB.Pedro;

public class Joao {

	void testAcessos() {
		Ana esposa = new Ana();
		Pedro filho = new Pedro();
		//System.out.println(esposa.segredo); Não pode pois é private
		System.out.println(esposa.fazDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		System.out.println(filho.formaDeFalar); //Pode pois vem de Ana, que está no mesmo pacote
	}
}
