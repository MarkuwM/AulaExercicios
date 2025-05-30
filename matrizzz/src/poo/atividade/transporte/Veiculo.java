package poo.atividade.transporte;

public abstract class Veiculo {
    private string id;
    private int quantidadePassageiros;
    private int viagens;

    public abstract double custoViagem();

    public void fazerViagem(){
    }

}
