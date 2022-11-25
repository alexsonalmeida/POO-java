import java.util.ArrayList;

public class ListaPaciente implements IAgregadorListaPaciente{
	ArrayList<Paciente> pacientes;
	
	public ListaPaciente(){
		pacientes = new ArrayList<Paciente>();
	}
	
	public void adicionaPaciente(Paciente paciente){
		this.pacientes.add(paciente);
	}
	
	public IIteratorListaPaciente criaIterador(){
		return new IteratorPacientListFromBehind(this.pacientes.toArray());
	}

}
