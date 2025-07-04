package poo.exercicio.transporte;

public class Trem extends Veiculo{
    private int custoFixo = 10;
    private int custoPorPassageiro = 2;

    @Override
    public void fazerViagem() {
        System.out.println("Realizando viagem com o trem");
    }

    @Override
    public void custoViagem() {

    }
}
