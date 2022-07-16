import java.util.ArrayList;

public class Lapiseira {
    private float calibre;
    private Grafite bico;
    private ArrayList<Grafite> tambor = new ArrayList<>();
    //private String tambString;

    Lapiseira(float calibre) {
        this.calibre = calibre;
        this.bico = null;
    }

    public String toString() {
        if (this.bico == null && this.tambor.size() == 0) {
            return "Calibre: " + this.calibre + "," + " bico: [" + "], " + "tambor: {" + "}";
        } else if (this.bico == null && this.tambor.size() != 0) {
            return "Calibre: " + this.calibre + "," + " bico: [" + "], " + "tambor: {" + this.tamString() + "}";
        } else if (this.bico != null && this.tambor.size() == 0) {
            return "Calibre: " + this.calibre + "," + " bico: " + this.bico.toString() + ", " + "tambor: {" + "}";
        } else {
            return "Calibre: " + this.calibre + "," + " bico: " + this.bico.toString() + ", " + "tambor: {" + this.tamString() + "}";
        }
    }

    public String tamString() {
        String tambString;
        tambString = this.tambor.get(0).toString();
        if (this.tambor.size() > 1) {
            for (int i = 1; i <= this.tambor.size() - 1; i++) {
                if (this.tambor.get(i) != null) {
                    tambString += this.tambor.get(i);
                }
            }
        }
        

        return tambString;
    }

    public boolean inserir(Grafite grafite) {
        if (grafite.getCalibre() != this.calibre) {
            System.out.println("Fail: calibre incompatível");
            return false;
        } else {
            this.tambor.add(grafite);
            return true;
        }
    }

    public Grafite remover() {
        if (this.bico == null) {
            System.out.println("Fail: não há grafite no bico");
            return this.bico;
        } else {
            this.bico = null;
            return this.bico;
        }
    }

    public boolean puxar() {
        if (this.bico != null) {
            System.out.println("Fail: já existe grafite no bico");
            return false;
        } else if (this.tambor.size() == 0) {
            System.out.println("fail: não existe grafite no tambor");
            return false;
        } else {
            this.bico = this.tambor.get(0);
            this.tambor.remove(this.bico);
            return true;
        }
    }

    public void escrever() {
        if (this.bico == null) {
            System.out.println("Fail: não existe grafite no bico");
        } else if (this.bico.getTamanho() <= 10) {
            System.out.println("fail: grafite acabou");
        } else if (this.bico.getTamanho() - this.bico.desgastePorFolha() < 10) {
            System.out.println("fail: folha incompleta");
            System.out.println("warning: grafite acabou");
            this.bico.setTamanho(10);
        } else {
            this.bico.setTamanho(this.bico.getTamanho() - this.bico.desgastePorFolha());
            if (this.bico.getTamanho() == 10) {
                System.out.println("Warning: grafite acabou");
            }
        }
    }
}
