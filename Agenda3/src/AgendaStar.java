import java.util.ArrayList;
import java.util.List;

class AgendaStar extends Agenda {
    public void star(String name, boolean value) {
        int i;
        for (i = 0; i < this.getContacts().size(); i++) {
            if (this.getContacts().get(i) instanceof ContactStar && this.getContacts().get(i).getName().equals(name)) {
                this.getContacts().get(i).setStar(value);
                break;
            }
        }

        if (i == this.getContacts().size()) {
            System.out.printf("fail: contato %s não existe \n", name);
        }
    }
    
    public List<ContactStar> getStarred() {
        List<ContactStar> lista = new ArrayList<>();

        for (int i = 0; i < this.getContacts().size(); i++) {
            if (this.getContacts().get(i) instanceof ContactStar && this.getContacts().get(i).getStar()) {
                lista.add(this.getContacts().get(i));
            }
        }

        return lista;
    }
}
