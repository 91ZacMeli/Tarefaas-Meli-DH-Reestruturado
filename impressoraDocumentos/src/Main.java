public class Main{
    public static void main(String[] args) {

        Curriculo curriculo = new Curriculo();
        Relatorio relatorio = new Relatorio();
        Livro livro = new Livro();


        livro.imprimirLivro(livro);
        relatorio.imprimirRelatorio(relatorio);
        curriculo.imprimirCurrriculo(curriculo);
        }
}
