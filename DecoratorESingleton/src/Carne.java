import component.PaoFrances;

public class Carne extends PaoFrancesDecorator {
    public Carne(PaoFrances pao) {
        super(pao);
        this.nome += " + Carne";
    }
}
