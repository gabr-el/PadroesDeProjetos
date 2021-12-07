package Atividade04;

public class FabricaTesla implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new ModeloS();
	}

}
