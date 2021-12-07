package Atividade04;

public class Dart implements Carro {

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: Dart\nFabricante: Dodge");
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerou");

	}

	@Override
	public void frear() {
		System.out.println("Freou");

	}

	@Override
	public void trocarMarcha() {
		System.out.println("Trocou de marcha");

	}

}
