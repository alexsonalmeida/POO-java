import java.util.ArrayList;
import java.util.List;

class Client {
    private String clientId;
    private List<Account> accounts;

    public Client(String clientId) {
        this.accounts = new ArrayList<>();
        this.clientId = clientId;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public java.lang.String toString() {
        return "- " + this.clientId + " [" + this.getAccounts().get(0).getId() + ", " + this.getAccounts().get(1).getId() + "]";
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
