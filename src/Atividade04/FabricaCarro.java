package Atividade04;

public abstract class FabricaCarro {
	public Carro criarCarro(ModeloCarro modelo) {
		switch (modelo) {
		case modeloS:
			return new ModeloS();
		case modeloX:
			return new ModeloX();
		case charger:
			return new Charger();
		case dart:
			return new Dart();
		default:
			break;
		}
		return null;
	}
}
