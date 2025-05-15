package poo.atividade;

// Classe base
class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

// Classe derivada
class Cachorro extends Animal {
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}
