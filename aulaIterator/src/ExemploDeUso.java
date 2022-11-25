
public class ExemploDeUso {

	public static void main(String[] args) {
		ExemploDeUso exemplo = new ExemploDeUso();
		exemplo.inicia();
	}
	
	public void inicia(){
		//adicionou pessoas na lista
		ListaPaciente lista = new ListaPaciente();
		lista.adicionaPaciente(new Paciente("Paulyne"));
		lista.adicionaPaciente(new Paciente("Andre"));
		lista.adicionaPaciente(new Paciente("Atilio"));
		lista.adicionaPaciente(new Paciente("Arag�o"));
		lista.adicionaPaciente(new Paciente("Arthur"));

		// percorrendo a Lista
		IIteratorListaPaciente iterador = lista.criaIterador();
		while (iterador.temProximo()) {
			System.out.println(iterador.leProximo().leNome());
		}
	}

}
