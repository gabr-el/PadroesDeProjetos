package Atividade04;

public class FabricaDodge implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Dart();
	}

}
