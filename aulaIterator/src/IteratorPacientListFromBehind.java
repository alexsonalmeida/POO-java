public class IteratorPacientListFromBehind implements IIteratorListaPaciente {
   Object[] pacientes;
	int indice;
	int tamanho;

	public IteratorPacientListFromBehind(Object[] pacientes) {
		this.pacientes = pacientes;
		this.tamanho = pacientes.length;
		this.indice = tamanho - 1;
	}
	
	public boolean temProximo() {
		if (indice >= 0) return true;
		return false;
	}

	public Paciente leProximo() {
		Paciente paciente = (Paciente) pacientes[indice];
		indice--;
		return paciente;
	}
}
