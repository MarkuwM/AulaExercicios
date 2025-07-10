package poo.exercicio.conceitos.teste;

class Quadro {
    public void escrever(String texto) {
        System.out.println("Quadro escreve: " + texto);
    }
}

class Sala {
    private Quadro quadro; // composição

    public Sala() {
        quadro = new Quadro(); // composição: criado dentro
    }

    public void usarQuadro(String texto) {
        quadro.escrever(texto);
    }
}
