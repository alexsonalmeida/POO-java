import Produtos.Celular;
import Produtos.Jogo;
import Produtos.Livro;
import Strategies.PrecoPorKg;

public class App {
    public static void main(String[] args) throws Exception {
        Jogo jogo1 = new Jogo("God Of War", 199.00, 10.0);
        Jogo jogo2 = new Jogo("Elder Ring", 225.00, 20.0);
        Jogo jogo3 = new Jogo("Stray", 100.00, 50.0);

        Livro livro1 = new Livro("Pequeno principe", 45.00, 50.0);
        Celular celular1 = new Celular("M52", 1700.00, 256.0);
        
        PrecoPorKg strategy1 = new PrecoPorKg();
        Compra compra = new Compra(strategy1);
        compra.addProduct(celular1);
        compra.addProduct(jogo1);
        compra.addProduct(jogo2);
        compra.addProduct(jogo3);
        compra.addProduct(livro1);

       System.out.println(compra.CalcularPreco());
    }
}
