public class SacoGrande extends SacoDeBombom implements TipoDeSaco {
    public SacoGrande(String marca, String tipo) {
        super(marca);
        quantidade = 50;
    }

    public String leTipo() {
        return "grande";
    }
}
