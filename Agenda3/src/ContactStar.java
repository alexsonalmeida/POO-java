import java.util.List;
class ContactStar extends Contact {
    private boolean star;
    public ContactStar(String name, List<Fone> fones, boolean star) {
        super(name, fones);
        this.star = star;
    }

    void setStar(boolean value) {
        this.prefix = "@";
        this.star = value;
        if (value == false) {
            this.prefix = "-";
        }
    }

    boolean getStar() {
        return star;
    }
}
