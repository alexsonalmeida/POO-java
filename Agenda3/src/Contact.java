import java.util.ArrayList;
import java.util.List;
public class Contact {
    private String name;
    private List<Fone> fones;
    protected String prefix = "-"; 

    public Contact(String name, List<Fone> fones) {
        this.fones = new ArrayList<>();
        this.name = name;
        int i = 0;

        if (fones != null) {
            for (i = 0; i <= fones.size() - 1; i++) {
                addFone(fones.get(i));
            }
        }
    }

    public void addFone(Fone fone) {
        if (fone.isValid()) {
            this.fones.add(fone);
        } else {
            System.out.println("fail: invalid number");
        }
    }

    public void rmFone(int index) {
        if (this.fones.get(index) != null) {
            this.fones.remove(index);
        }
    }

    public String toString() {
        return this.prefix + " " + this.name + ": " + fonesString(this.fones);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Fone> getFones() {
        return fones;
    }

    public String fonesString(List<Fone> fones) {
        String retorno = "";

        for (int i = 0; i < fones.size(); i++) {
            retorno += "[" + i + ":"+ fones.get(i) + "]" + " ";
        }

        return retorno;
    }

    public void setFones(List<Fone> fones) {
        this.fones = fones;
    }

}