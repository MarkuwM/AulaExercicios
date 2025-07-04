package poo.exercicio.ilustrarconceitospoo;

class Animal {
    String nome;
    int idade;

    public void emitirSom() {
        System.out.println("Som genérico do animal");
    }
}

class Cachorro extends Pessoa {
    public void emitirSom() {
        System.out.println("Latido");
    }
}
