package poo.exercicio.ilustrarconceitospoo;

class Professor {
    String nome;

    Professor(String nome) {
        this.nome = nome;
    }

    public void mostrarNome() {
        System.out.println("Professor: " + nome);
    }
}

class Escola {
    Professor professor;

    Escola(Professor professor) {
        this.professor = professor;
    }

    public void mostrarProfessor() {
        System.out.println("Professor da escola: " + professor.nome);
    }
}
