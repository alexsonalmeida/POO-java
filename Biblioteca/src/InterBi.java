import java.util.Scanner;

public class InterBi {
    private Scanner ler;
    private GerenBi gerenciador;

    public InterBi() {
        this.ler = new Scanner(System.in);
        this.gerenciador = new GerenBi();
    }

    public void requisitarDados() {
        String titulo, ISBN, autor;
        System.out.println("Por favor digite as informações do Livro");
        System.out.print("Titulo do livro: ");
        titulo = ler.nextLine();
        System.out.print("ISBN do livro: ");
        ISBN = ler.nextLine();
        System.out.print("Autor do livro: ");
        autor = ler.nextLine();
        this.gerenciador.criarLivro(titulo, ISBN, autor);
    }

    public void imprimirDados() {
        this.gerenciador.imprimirEstoque();
    }
}
