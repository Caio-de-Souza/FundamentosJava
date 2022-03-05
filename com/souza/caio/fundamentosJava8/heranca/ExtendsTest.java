package com.souza.caio.fundamentosJava8.heranca;

public class ExtendsTest {

	public static void test() {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		System.out.println(monstro.vida);
		System.out.println(heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
	}
}