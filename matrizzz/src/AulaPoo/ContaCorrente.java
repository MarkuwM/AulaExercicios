package AulaPoo;

public class ContaCorrente {

    public String nome = "Nome do Cliente";

    public float saldo = 100;

    public ContaCorrente(){
        System.out.println("Instanciando um objeto do tipo ContaCorrente");
    }

    public float verificarSaldo() {
        System.out.println("Saldo de: " + saldo);
        return saldo;
    }
    public void depositarValor (float valor){
        saldo = saldo + valor;
    }
    public void sacarValor (float valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - valor;
        }
    }
}