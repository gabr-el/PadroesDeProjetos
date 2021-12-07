package Atividade03;

public class foguete {

    private String modelo;
    private String motores;
    private int assentos;

    @Override
    public String toString() {
        return "foguete{" +
                "modelo='" + modelo + '\'' +
                ", motores='" + motores + '\'' +
                ", assentos=" + assentos +
                '}';
    }

    foguete(String modelo, String motores, int assentos) {
        this.modelo = modelo;
        this.motores = motores;
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public String getMotores() {
        return motores;
    }

    public void setMotores(String motores) {
        this.motores = motores;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
