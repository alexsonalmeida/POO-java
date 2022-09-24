import java.util.ArrayList;

public class Frota {
	private ArrayList<Veiculo> veiculos;
	private Funcionario gerente;
	
	public Frota() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	public int leNumeroRodas() {
		int rodas = 0;
		for (Veiculo v: veiculos) {
         rodas += v.getRodas();
		}
		return rodas;
	}

	public void setGerente(Funcionario gerente) {
      this.gerente = gerente;
	}

	private Veiculo criarVeiculo(String tipo, String chassi) {
      switch(tipo) {
			case "Moto": 
			   return new Moto(chassi);
			case "Carro": 
			   return new Carro(chassi);
			case "Caminhão":
			   return new Caminhao(chassi);
			default:
			   throw new NullPointerException();
		}
	}
	
	public void adicionaVeiculo(String chassi, String tipo, Funcionario funcionario) {
		if (funcionario.equals(gerente)) {
			try {
				Veiculo v = criarVeiculo(tipo, chassi);
				this.veiculos.add(v);
				System.out.println("Veículo adicionado com sucesso!");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		} 
	}

	@Override
	public String toString() {
		return this.veiculos.toString();
	}
}
