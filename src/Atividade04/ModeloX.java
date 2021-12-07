package Atividade04;

public class ModeloX implements Carro {

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: ModeloX\nFabricante: Tesla");
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
		System.out.println("troucou de marcha");

	}

}
