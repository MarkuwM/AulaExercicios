package poo.exercicio.conceitos.teste;

class Pagamento implements Servico {
    @Override
    public void executar() {
        System.out.println("Pagamento realizado.");
    }

    public void executar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado.");
    }
}
