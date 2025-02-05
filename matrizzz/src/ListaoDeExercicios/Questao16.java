package ListaoDeExercicios;

import java.time.LocalDate;

public class Questao16 {
    public record UsuarioDTO(String nome, String email, LocalDate dataNascimento) {
    }

    public static void main(String[] args) {
        UsuarioDTO usuario = new UsuarioDTO("João Silva", "joao.silva@email.com", LocalDate.of(1990, 5, 15));

        System.out.println("Nome: " + usuario.nome());
        System.out.println("Email: " + usuario.email());
        System.out.println("Data de Nascimento: " + usuario.dataNascimento());
    }
}
