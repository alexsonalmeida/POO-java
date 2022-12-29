import component.PaoFrances;

public class Alface extends PaoFrancesDecorator{
    public Alface(PaoFrances pao) {
        super(pao);
        this.nome += " + Alface";
    }
}
