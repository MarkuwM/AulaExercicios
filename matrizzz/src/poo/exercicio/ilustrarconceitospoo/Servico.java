package poo.exercicio.ilustrarconceitospoo;

interface Servico {
    void executar();
}

class Banho implements Servico {
    public void executar() {
        System.out.println("Executando banho no animal");
    }
}
