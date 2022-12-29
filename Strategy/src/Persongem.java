public class Persongem {
    private ArmaStrategy arma;

    public Persongem(ArmaStrategy arma) {
        this.arma = arma;
    }

    public void atacar() {
        System.out.println("Atacando com dano: " + this.arma.getDano());
    }
}
