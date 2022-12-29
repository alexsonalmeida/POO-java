public class App {
    public static void main(String[] args) {
        EspadaDeUmaMao SUM = new EspadaDeUmaMao();
        Persongem guerreiro = new Persongem(SUM);
        guerreiro.atacar();
    }
}
