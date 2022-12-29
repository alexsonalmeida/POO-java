import component.PaoFrances;

public class Queijo extends PaoFrancesDecorator{
    public Queijo(PaoFrances pao) {
        super(pao);
        this.nome += " + Queijo";
    }
}
