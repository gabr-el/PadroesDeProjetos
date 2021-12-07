package Atividade03;

public class fogueteBuilder {
    private String modelo;
    private String motores;
    private int assentos;

    public fogueteBuilder Modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public fogueteBuilder Motores(String motores) {
        this.motores = motores;
        return this;
    }

    public fogueteBuilder Assentos(int assentos) {
        this.assentos = assentos;
        return this;
    }

    public foguete createFoguete() {
        return new foguete(modelo, motores, assentos);
    }
}