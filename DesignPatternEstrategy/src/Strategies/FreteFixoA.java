package Strategies;
import java.util.ArrayList;

import Interfaces.IStrategy;
import Produtos.Produto;

public class FreteFixoA implements IStrategy {
   @Override
   public Double calcularFrete(ArrayList<Produto> products) {
      return 25.00;
   }
}
