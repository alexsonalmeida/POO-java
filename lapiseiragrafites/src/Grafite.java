public class Grafite {
    private float calibre;
    private String dureza;
    private int tamanho;

    Grafite(float calibre, String dureza, int tamanho) {
        this.calibre = calibre;
        this.dureza = dureza;
        this.tamanho = tamanho;
    }

    public String toString() {
        return "[" + this.calibre + ":" + this.dureza + ":" + this.tamanho + "]";
    }

    public int desgastePorFolha() {
        int desgaste = 0;
        if (this.dureza.equals("HB")) {
            desgaste = 1;
            return desgaste;
        } else if (this.dureza.equals("2B")) {
            desgaste = 2;
            return desgaste;
        } else if (this.dureza.equals("4B")) {
            desgaste = 4;
            return desgaste;
        } else {
            desgaste = 6;
            return desgaste;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public float getCalibre() {
        return calibre;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
