public class SacoPequeno extends SacoDeBombom implements TipoDeSaco{
    public SacoPequeno(String marca) {
        super(marca);
        quantidade = 10;
    }

    public String leTipo() {
        return "pequeno";
    }
}