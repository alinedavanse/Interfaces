package br.trainee.aline.interfaces;

public class Circulo implements AreaCalculavel {

	private double raio;
	private double pi;

	public Circulo(double raio, double pi) {
		this.raio = raio;
		this.pi = pi;
	}

	@Override
	public double calculaArea() {
		return Math.PI * raio * raio;
	}

}
