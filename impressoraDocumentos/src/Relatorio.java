public class Relatorio implements Impressora {
    private int comprimentoTexto;
    private int numeroDePaginas;
    private String autor;
    private String revisor;

    public Relatorio() {
    }

    public Relatorio(int comprimentoTexto, int numeroDePaginas, String autor, String revisor) {
        this.comprimentoTexto = comprimentoTexto;
        this.numeroDePaginas = numeroDePaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public void imprimirCurrriculo(Curriculo curriculo) {

    }

    @Override
    public void imprimirLivro(Livro livro) {

    }

    @Override
    public void imprimirRelatorio(Relatorio relatorio) {

    }

    public int getComprimentoTexto() {
        return comprimentoTexto;
    }

    public void setComprimentoTexto(int comprimentoTexto) {
        this.comprimentoTexto = comprimentoTexto;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }
}
