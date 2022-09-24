public class Main {
   public static void main(String[] args) {
      Funcionario gerente = new Funcionario("Daniel");
      
      Frota frota = new Frota();
      frota.setGerente(gerente);

      frota.adicionaVeiculo("GSGS72727", "Carro", gerente);
      frota.adicionaVeiculo("HYW326672", "Moto", gerente);

      System.out.println(frota.toString());
   }
}
