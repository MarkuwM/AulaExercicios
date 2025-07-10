package poo.exercicio.conceitos;

interface Servico {
    void executar();
}

class Banho implements Servico {
    public void executar() {
        System.out.println("Executando banho no animal");
    }
}
