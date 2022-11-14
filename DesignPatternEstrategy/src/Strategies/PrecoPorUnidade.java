package Strategies;
import java.util.ArrayList;

import Interfaces.IStrategy;
import Produtos.Produto;

public class PrecoPorUnidade implements IStrategy {
   @Override
   public Double calcularFrete(ArrayList<Produto> products) {
      return (double)products.size() * 7.50;
   }
}
