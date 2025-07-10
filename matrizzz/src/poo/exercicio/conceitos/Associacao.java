package poo.exercicio.conceitos;

class Veterinario {
    String nome;

    public void atender(Animal animal) {
        System.out.println(nome + " atendeu o animal: " + animal.nome);
    }
}
