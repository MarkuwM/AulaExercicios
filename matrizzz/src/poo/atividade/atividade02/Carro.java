package poo.atividade.atividade02;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0;
    }

    public void imprimirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }
        System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
