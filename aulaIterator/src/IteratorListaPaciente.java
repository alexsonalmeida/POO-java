public class IteratorListaPaciente implements IIteratorListaPaciente{
	Object[] pacientes;
	int indice = 0;
	int tamanho;
	public IteratorListaPaciente (Object[] pacientes){
		this.pacientes = pacientes;
		this.tamanho = pacientes.length;
	}
	
	public boolean temProximo(){
		if(indice<=tamanho -1){
			return true;
		} else {
			return false;
		}
	}
	public Paciente leProximo(){
		Paciente paciente = (Paciente)pacientes[indice];
		indice++;
		return paciente;
	}
}
