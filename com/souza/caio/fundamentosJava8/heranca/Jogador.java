package com.souza.caio.fundamentosJava8.heranca;

import com.souza.caio.fundamentosJava8.enuns.Direcao;

public class Jogador {
	int x;
	int y;
	int vida = 100;
	
	boolean atacar (Jogador oponente) {
		int deltaX = Math.abs(this.x - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);
		
		if((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0)) {
			oponente.vida -= 10; 
			return true;
		}
		return false;
	}
	
	boolean andar(Direcao direcao) {
		if(direcao == Direcao.NORTE || direcao == Direcao.SUL) {
			this.y = this.y + direcao.getDeslocamento();
		}else {
			this.x = this.x + direcao.getDeslocamento();
		}
		return true;
	}
}
