package poo.exercicio.transporte;

public abstract class Veiculo {
    private String id;
    private int quantidadePassageiros;
    private int viagens;

    public abstract void fazerViagem();

    public abstract void custoViagem();
}
