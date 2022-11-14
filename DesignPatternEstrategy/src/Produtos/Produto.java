package Produtos;

public abstract class Produto {
   public String nome;
   public Double preco;
   public Double peso;

   public Produto(String nome, Double preco, Double peso) {
      this.nome = nome;
      this.preco = preco;
      this.peso = peso;
   }
}
