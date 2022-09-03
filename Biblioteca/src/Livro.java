public class Livro {
    private String titulo;
    private String ISBN;
    private String autor;

    public Livro(String titulo, String ISBN, String autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getAutor() {
        return autor;
    }
    
    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + 
               "\nISBN: " + getISBN() +
               "\nAutor: " + getAutor();
    }
}
