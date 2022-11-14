package Interfaces;

import java.util.ArrayList;

import Produtos.Produto;

public interface IStrategy {
   public Double calcularFrete(ArrayList<Produto> products);
}
