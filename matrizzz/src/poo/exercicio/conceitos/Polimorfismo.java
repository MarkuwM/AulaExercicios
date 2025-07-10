package poo.exercicio.conceitos;

class Pessoa {
    private String nome;

    public void falar(){
        System.out.println();
    }
    public void falar(String nome){
        System.out.println("Meu nome é: " + nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Joao extends Pessoa{

    @Override
    public void falar(){
        System.out.println("Olá");
    }

    @Override
    public void setNome(String nome) {
        super.setNome("João");
    }
}