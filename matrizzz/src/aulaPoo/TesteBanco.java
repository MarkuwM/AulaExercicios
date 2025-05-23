package aulaPoo;

public class TesteBanco {
    public static void main(String[] args) {
        ContaCorrente contaDoToin = new ContaCorrente();
        contaDoToin.nome = "Antônio";
        contaDoToin.saldo = 1000;
        contaDoToin.verificarSaldo();
        System.out.println("Correntista: " + contaDoToin.nome);
        contaDoToin.sacarValor(200);
        contaDoToin.verificarSaldo();
    }
}
