package ListaoDeExercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Questao14v2 {
    public static void main(String[] args) {
        String[] index = {"index.html", "Página Inicial com o Menu das minhas Disciplinas", "Página com o resumo de todas as disciplinas que curso em ADS"};
        String[] programacaoII = {"programacaoII.html", "Programação II", "Disciplina que tem um ótimo professor de programação!"};
        String[] estruturaDeDados = {"estrutura-de-dados.html", "Estrutura de Dados", "Disciplina onde aprendi diversas coisas interessantes sobre estruturas de dados na programação."};
        String[] poo = {"poo.html", "Programação Orientada à Objetos", "Disciplina na qual vou aprender muitas coisas interessantes também!"};

        gerarPaginaWeb(index);
        gerarPaginaWeb(programacaoII);
        gerarPaginaWeb(estruturaDeDados);
        gerarPaginaWeb(poo);

    }

    public static void gerarPaginaWeb(String[] conteudo) {
        String paginaWeb = """
                           <html>
                               <head>
                                   <title>Disciplinas de ADS</title>
                               </head>
                               <body>
                                   <h1>%s</h1>
                                   <p>%s</p>
                               </body>
                           </html>
                           """.formatted(conteudo[1], conteudo[2]);
        Path caminhoArquivo = Path.of(conteudo[0]);

        try {
            Files.writeString(caminhoArquivo, paginaWeb, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}
