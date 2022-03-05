package com.souza.caio.fundamentosJava8.enuns;

public enum Direcao {
	NORTE(+1),
	LESTE(+1),
	SUL(-1),
	OESTE(-1);
	
	private int deslocamento;

	private Direcao(int deslocamento) {
		this.deslocamento = deslocamento;
	}

	public int getDeslocamento() {
		return deslocamento;
	}
}
