import java.util.ArrayList;

public class Estoque {
    public ArrayList<Livro> livros;

    public Estoque() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    @Override
    public String toString() {
        return livros.toString();
    }
}
