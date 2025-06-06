package poo.atividade.transporte;

public class Onibus extends Veiculo{
    private int custoFixo = 10;
    private int custoPorPassageiro = 2;

    @Override
    public void fazerViagem() {
        System.out.println("Realizando viagem com o onibus");
    }
    @Override
    public void custoViagem() {
    }
}
