import java.util.ArrayList;

import Interfaces.IStrategy;
import Produtos.Produto;

public class Compra {
   private ArrayList<Produto> products;
   private IStrategy strategy;

   public Compra(IStrategy strategy) {
      this.strategy = strategy;
      this.products = new ArrayList<Produto>();
   }

   public Double CalcularPreco() {
      Double valorTotal = 0.0;

      Double frete = this.strategy.calcularFrete(products);
      for(Produto p : products) {
        valorTotal += p.preco;
      }

      return (valorTotal + frete);
   }

   public int getQuantidadeDeProdutos() {
      return products.size();
   }

   public void addProduct(Produto p) {
      this.products.add(p);
   }
}
