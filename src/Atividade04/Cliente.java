package Atividade04;

public class Cliente {
	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaTesla();
		Carro carro = fabrica.criarCarro();
		carro.trocarMarcha();
		carro.frear();
		carro.acelerar();
		carro.exibirInfo();
		System.out.println();

		fabrica = new FabricaDodge();
		carro = fabrica.criarCarro();
		carro.trocarMarcha();
		carro.frear();
		carro.acelerar();
		carro.exibirInfo();
		System.out.println();

	}
}
