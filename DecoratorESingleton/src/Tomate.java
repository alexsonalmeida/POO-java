import component.PaoFrances;

public class Tomate extends PaoFrancesDecorator {
    public Tomate(PaoFrances pao) {
        super(pao);
        this.nome += " + Tomate";
    }
}
