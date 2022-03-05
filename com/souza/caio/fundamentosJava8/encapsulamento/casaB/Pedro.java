package com.souza.caio.fundamentosJava8.encapsulamento.casaB;

import com.souza.caio.fundamentosJava8.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testarAcessos() {
		Ana mae = new Ana();
		// System.out.println(mae.segredo); Não pode pois é private
		//System.out.println(mae.fazDentroDeCasa); Não pode pois é public no package
		//System.out.println(mae.formaDeFalar); Protected só é publico no pacote e passado por herança
		System.out.println(formaDeFalar); //Passado por herança
		System.out.println(mae.todosSabem);
	}
}
