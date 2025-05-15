package listaoDeExercicio;

public class Questao14 {
    public static void main(String[] args) {
        String relatorioDeVendas = "Relatorio de Vendas";
        String detalhamentoDasVendas = "As vendas do último mês bateram todas as metas. Todos estão de parabéns!";

        String relatorioDeNotas = "Relatorio de Notas da Turma de Programação II";
        String detalhamentoDasNotas = "Todos os alunos passaram direto na disciplina. Boas férias!!!";

        System.out.println(gerarPaginaWeb(relatorioDeNotas, detalhamentoDasNotas));
    }

    public static String gerarPaginaWeb(String titulo, String conteudo) {
        return """
                           <html>
                               <head>
                                   <title>%s</title>
                               </head>
                               <body>
                                   <h1>Conteúdo</h1>
                                   <p>%s</p>
                               </body>
                           </html>
                           """.formatted(titulo, conteudo);
    }
}
