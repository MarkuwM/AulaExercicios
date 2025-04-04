package poo.alderlindson.atividade01;

public class TesteAnimalDeEstimacao {
    public static void main(String[] args) {
        AnimalDeEstimacao animal1 = new AnimalDeEstimacao("Destruidor", "Cachorro", 5, "Pitbull");
        AnimalDeEstimacao animal2 = new AnimalDeEstimacao("Xane", "Gato", 3, "Persa");
        AnimalDeEstimacao animal3 = new AnimalDeEstimacao("Louro José", "Pássaro", 1, "Papagaio");

        System.out.println("Detalhes do Animal 1");
        animal1.imprimirDetalhes();
        animal1.emitirSom();

        System.out.println("\nDetalhes do Animal 2");
        animal2.imprimirDetalhes();
        animal2.emitirSom();

        System.out.println("\nDetalhes do Animal 3");
        animal3.imprimirDetalhes();
        animal3.emitirSom();
    }
}
