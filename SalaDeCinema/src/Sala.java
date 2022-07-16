import java.util.ArrayList;
public class Sala {
    private ArrayList<Client> cadeiras = new ArrayList<>();
    
    public Sala(int capacidade) {
        String vazio = "null";
        Client clienteVazio = new Client(vazio, vazio);
        for (int i = 0; i < capacidade; i++) {
            this.cadeiras.add(i, clienteVazio);
        }
    }

    public boolean reservar(String id, String fone, int ind) {
        Client cliente = new Client(id, fone);
        String vazio = "null";
        Client clienteVazio = new Client(vazio, vazio);
        int presente = 0;

        if (ind > this.cadeiras.size() - 1) {
            System.out.println("Fail: número da cadeira não existe");
            return false;
        } else {
            for (int i = 0; i < this.cadeiras.size() - 1; i++) {
                if (this.cadeiras.get(i).getId().equals(id)) {
                    presente = 1;
                    break;
                }
            }

            if (presente == 1) {
                System.out.println("Fail: cliente já está no cinema");
                return false;
            } else {
                if (this.cadeiras.get(ind).getId().equals(clienteVazio.getId())) {
                    this.cadeiras.remove(ind);
                    this.cadeiras.add(ind, cliente);
                    return true;
                } else {
                    System.out.println("Fail: cadeira já está ocupada");
                    return false;
                }             
            }            
        }
    }

    public void cancelar(String id) {
        String vazio = "null";
        Client clienteVazio = new Client(vazio, vazio);
        int cancel = 0;
        int i = 0;

        for (i = 0; i <= this.cadeiras.size() - 1; i++) {
            if (cadeiras.get(i).getId().equals(id)) {
                this.cadeiras.set(i, clienteVazio);
                cancel = 1;
                break; 
            } 
        }

        if (i == this.cadeiras.size() - 1 && cancel == 0) {
            System.out.println("Fail: cliente não está no cinema"); 
        }        
    }

    String salaString() {
        String msg = "";
        String vazio = "null";

        for (int i = 0; i < this.cadeiras.size() ; i++) {
            if (i == 0) {
                if (this.cadeiras.get(i).getId().equals(vazio)) {
                    msg = "- ";
                } else {
                    msg = this.cadeiras.get(i).toString();
                }
            } else {
                if (this.cadeiras.get(i).getId().equals(vazio)) {
                    msg += "- ";
                } else {
                    msg += this.cadeiras.get(i).toString();
                } 
            }
        }

        return msg;
    }

    public String toString() {
        return "[ " + this.salaString() + "]";
    }

    public ArrayList<Client> getCadeiras() {
        return cadeiras;
    }
}
