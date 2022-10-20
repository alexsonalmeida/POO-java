import java.util.ArrayList;

public class Compra {
	private ArrayList<TipoDeSaco> sacosDeBombons;
	
	public Compra() {
		sacosDeBombons = new ArrayList<TipoDeSaco>();
	}
	
	public int contaQuantidadeBombons (){
        int quantidade = 0;

        for (TipoDeSaco s : sacosDeBombons) {
            quantidade += s.getQuantidade();
        }

        return quantidade;
	}
	
	public void adicionaSacoBombom(TipoDeSaco sacosDeBombons){
		this.sacosDeBombons.add(sacosDeBombons);
	}
}
