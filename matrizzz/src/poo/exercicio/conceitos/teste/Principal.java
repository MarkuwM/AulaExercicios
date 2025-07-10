package poo.exercicio.conceitos.teste;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Aluno("Maria", 16);
        Pessoa p2 = new Professor("Carlos", 40);

        p1.apresentar(); // Chama versão do Aluno
        p2.apresentar(); // Chama versão do Professor

        // Sobrecarga
        Pagamento pag = new Pagamento();
        pag.executar();
        pag.executar(200.50);

        // Composição
        Sala sala = new Sala();
        sala.usarQuadro("Bem-vindos à aula!");

        // Associação
        Aula aula = new Aula((Professor) p2);
        aula.ensinar((Aluno) p1);

        // Agregação
        Escola escola = new Escola(
            List.of((Professor) p2),
            List.of((Aluno) p1)
        );
        escola.listarPessoas();
    }
}
