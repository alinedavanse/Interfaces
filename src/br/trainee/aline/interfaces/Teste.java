package br.trainee.aline.interfaces;

public class Teste {

	public static void main(String[] args) {

		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());

		AreaCalculavel b = new Quadrado(3);
		System.out.println(b.calculaArea());

		AreaCalculavel c = new Circulo(2, 3.1456);
		System.out.println(c.calculaArea());
	}

}
