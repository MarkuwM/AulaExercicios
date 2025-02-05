package ListaoDeExercicios;

public class Questao13 {
    public static void main(String[] args) {
        String json = """
                {
                    "nome": "João",
                    "idade": 30,
                    "endereco": {
                        "rua": "Rua A",
                        "numero": 123
                    },
                    "contatos": [
                        {
                            "tipo": "telefone",
                            "numero": "1234-5678"
                        },
                        {
                            "tipo": "email",
                            "numero": "joao@example.com"
                        }
                    ]
                }
                """;

        System.out.println(json);
    }
}
