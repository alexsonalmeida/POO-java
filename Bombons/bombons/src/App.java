public class App {
    public static void main(String[] args) throws Exception {
        Compra c = new Compra();

        SacoPequeno sp = new SacoPequeno("Garoto");
        SacoMedio sm = new SacoMedio("Lacta");

        c.adicionaSacoBombom(sp);
        c.adicionaSacoBombom(sm);
        
        System.out.println(c.contaQuantidadeBombons());
    }
}
