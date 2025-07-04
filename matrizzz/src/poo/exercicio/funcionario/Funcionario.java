package poo.exercicio.funcionario;

public abstract class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(String nome){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(String cpf){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
