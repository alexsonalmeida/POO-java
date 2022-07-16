import java.util.ArrayList;
import java.util.List;
public class Agenda {
    private List<ContactStar> contacts;

    public Agenda() {
        contacts = new ArrayList<>();
    }

    private int findPosByName(String name) {
        int retorno = -1;
        
        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getName().equals(name)) {
                retorno = 1;
                break;
            }
        }
        
        return retorno;
    }

    public Contact findContact(String name) {
        if (findPosByName(name) == -1) {
            return null;
        } else {
            return this.contacts.get((findPosByName(name)-1));
        }
    }

    public void addContact(ContactStar contact) {
        boolean presente = false;

        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getName().equals(contact.getName())) {
                presente = true;
                for (int j = 0; j < contact.getFones().size(); j++) {
                    this.contacts.get(i).addFone(contact.getFones().get(j));
                }
                break;
            }
        }

        if (presente == false) {
            this.contacts.add(contact);
        }

        this.contacts.sort((Contact c1, Contact c2) -> (c1.getName().compareTo(c2.getName())));
    }

    public void rmContact(String name) {
        if (findPosByName(name) != -1) {
            this.contacts.remove((findPosByName(name)-1));
        } else {
            System.out.println("fail: contato nao encontrado");
        }
    }

    public List<Contact> search(String pattern) {
        List<Contact> list = new ArrayList<>();
        for (Contact contact : this.contacts) {
            if (contact.getName().contains(pattern)) {
               list.add(contact);
            } else {
                for (Fone fone : contact.getFones()) {
                    if (fone.getNumber().contains(pattern) || fone.getId().contains(pattern)) {
                        list.add(contact);
                    }
                }
            }
        }
        
        return list;
    }

    public List<ContactStar> getContacts() {
        return this.contacts;
    }

    public String toString() {
        String msg = "";
        
        for (int i = 0; i < this.contacts.size(); i++) {
            if (i == (this.contacts.size() - 1)) {
                msg += this.contacts.get(i).toString();
            } else {
                msg += this.contacts.get(i).toString() + "\n";
            }
        }

        return msg;
    }
}
