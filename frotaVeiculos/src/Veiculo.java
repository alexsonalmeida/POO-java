public abstract class Veiculo implements ItemRodas {
   private String chassi;
	protected int rodas;
	
	public Veiculo(String chassi){
		this.chassi = chassi;
	}

	public int getRodas() {
		return this.rodas;
	}

	public String getChassi() {
		return this.chassi;
	}
	@Override
	public String toString() {
		return this.chassi + " " + this.rodas;
	}
}
