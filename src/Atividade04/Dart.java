package Atividade04;

public class Dart implements Carro {

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: Dart\nFabricante: Dodge");
	}

	@Override
	public void acelerar() {
		System.out.println("acelerou");

	}

	@Override
	public void frear() {
		System.out.println("freou");

	}

	@Override
	public void trocarMarcha() {
		System.out.println("trocou de marcha");

	}

}
