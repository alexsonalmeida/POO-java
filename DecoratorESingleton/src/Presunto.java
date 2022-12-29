import component.PaoFrances;

public class Presunto extends PaoFrancesDecorator{
    public Presunto(PaoFrances pao) {
        super(pao);
        this.nome += " + Presunto";
    }
}
