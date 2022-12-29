public class App {
    public static void main(String[] args) throws Exception {
        Personagem p = new Personagem();
        MamaeDragao m1 = new MamaeDragao();

        p.addObserver(m1);
        p.setOvosColetados(100);
        System.out.println(m1.getEstado());
    }
}
