package poo.exercicio.conceitos;

abstract class Funcionario {
    String nome;
    double salario;

    public abstract double calcularSalario();
}

class VeterinarioCLT extends Funcionario {
    public double calcularSalario() {
        return salario;
    }
}
