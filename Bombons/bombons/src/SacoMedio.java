public class SacoMedio extends SacoDeBombom implements TipoDeSaco{
    public SacoMedio(String marca) {
        super(marca);
        quantidade = 25;
    }

    public String leTipo() {
        return "medio";
    }
}
