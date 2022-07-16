import java.util.ArrayList;
import java.util.List;

class BankAgency {
    private List<Client> clients;
    private List<Account> accounts;
    private int nextAccountId = 0;

    private Account getAccount(int id) throws NullPointerException {
        Account conta = null;

        try {
            for (int i = 0; i < this.accounts.size(); i++) {
                if (this.accounts.get(i).getId() == id) {
                    conta = this.accounts.get(i);
                }
            }
        } finally {
            
        }  

        return conta;
    }

    public BankAgency() {
        this.clients = new ArrayList<>();
        this.accounts = new ArrayList<>();        
    }

    public void addClient(String clientId) {
        if (this.clients == null) {
            Client client = new Client(clientId);
            SavingsAccount cp = new SavingsAccount(nextAccountId, clientId);
            this.nextAccountId++;
            client.addAccount(cp);
            this.accounts.add(cp);

            CheckingAccount cc = new CheckingAccount(nextAccountId, clientId);
            this.nextAccountId++;
            client.addAccount(cc);
            this.accounts.add(cc);

            this.clients.add(client);
        } else {
            boolean presente = false;

            for (int i = 0; i < this.clients.size(); i++) {
                if (this.clients.get(i).getClientId().equals(clientId)) {
                    presente = true;
                    System.out.println("fail: cliente ja existe");
                    break;
                }
            }

            if (!presente) {
                Client client = new Client(clientId);                
                CheckingAccount cc = new CheckingAccount(nextAccountId, clientId);
                this.nextAccountId++;
                client.addAccount(cc);
                this.accounts.add(cc);

                SavingsAccount cp = new SavingsAccount(nextAccountId, clientId);
                this.nextAccountId++;
                client.addAccount(cp);
                this.accounts.add(cp);

                this.clients.add(client);                
            }
        }
    }

    public void withdraw(int idConta, float value) {
        this.getAccount(idConta).withdraw(value);
    }

    public void deposit(int idConta, float value) {
        this.getAccount(idConta).deposit(value);
    }

    public void transfer(int contaDe, int contaPara, float value) {
        this.getAccount(contaDe).transfer(this.getAccount(contaPara), value);
    }

    public void monthlyUpdate() {
        if (this.accounts != null) {
            for (int i = 0; i < this.accounts.size(); i += 2) {
                this.accounts.get(i).monthlyUpdate();
                this.accounts.get(i+1).monthlyUpdate();
            }            
        }
    }

    public String toString() throws NullPointerException{
        String msg = "Clients: \n";

        if (this.accounts != null && this.clients != null) {
            for (int i = 0; i < this.clients.size(); i++) {
                msg += this.clients.get(i).toString() + "\n";
            } 

            msg += "Accounts: \n";
            
            for (int i = 0; i < this.accounts.size(); i++) {
                if (i == (this.accounts.size()-1)) {
                    msg += this.accounts.get(i).toString();
                } else {
                    msg += this.accounts.get(i).toString() + "\n";
                }
            }
        }
        
        return msg;
    }
}
