public class GerenBi {
    private Livro livro;
    private Estoque estoque;

    public GerenBi() {
        this.estoque = new Estoque();
    }

    public void criarLivro(String titulo, String ISBN, String autor) {
        this.livro = GerenLivro.criarLivro(titulo, ISBN, autor);
        adicionarLivro();
    }

    public void adicionarLivro() {
        this.estoque.adicionarLivro(this.livro);
    }

    public void imprimirEstoque() {
        System.out.println(this.estoque);
    } 
}
