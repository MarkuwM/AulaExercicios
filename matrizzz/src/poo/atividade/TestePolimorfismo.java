package poo.atividade;

class Gato extends Animal {
    public void fazerSom() {
        System.out.println("O gato mia");
    }
}

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuAnimal1 = new Cachorro();
        Animal meuAnimal2 = new Gato();

        meuAnimal1.fazerSom(); // O cachorro late
        meuAnimal2.fazerSom(); // O gato mia
    }
}
