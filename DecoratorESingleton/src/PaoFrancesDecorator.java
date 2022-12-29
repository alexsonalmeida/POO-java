import component.PaoFrances;

public abstract class PaoFrancesDecorator extends PaoFrances {
    protected PaoFrances pao;
    
    public PaoFrancesDecorator(PaoFrances pao) {
        this.nome = pao.nome;
        this.pao = pao;
    }

    public String toString() {
        String string = this.nome;
        return string;
    }
}
