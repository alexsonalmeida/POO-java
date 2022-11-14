package Strategies;
import java.util.ArrayList;

import Interfaces.IStrategy;
import Produtos.Produto;

public class PrecoPorKg implements IStrategy {
   @Override
   public Double calcularFrete(ArrayList<Produto> products) {
      Double pesoTotal = 0.0;
      
      for(Produto p : products) pesoTotal += p.peso;
      return (pesoTotal / 100);
   }
}
