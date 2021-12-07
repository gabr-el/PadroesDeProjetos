package Atividade04;

public class ModeloS implements Carro {
	String ModeloS;

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: Modelo S\nFabricante: Tesla");
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
