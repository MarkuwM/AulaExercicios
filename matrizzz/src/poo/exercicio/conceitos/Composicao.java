package poo.exercicio.conceitos;

class Motor {
    public void ligar() {
        System.out.println("Motor ligado");
    }
}

class Carro {
    private Motor motor;

    Carro() {
        motor = new Motor();
    }

    public void ligarCarro() {
        motor.ligar();
        System.out.println("Carro ligado");
    }
}
