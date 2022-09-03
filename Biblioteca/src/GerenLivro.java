public class GerenLivro {
    public static Livro criarLivro(String titulo, String ISBN, String autor){
        return new Livro(titulo, ISBN, autor);
    }
}
