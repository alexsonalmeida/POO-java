import java.text.DecimalFormat;
import java.util.Locale;
abstract class Account {
    protected int id;
    protected float balance;
    protected String clientId;
    protected String type;

    public Account(int id, String clientId) {
        this.id = id;
        this.clientId = clientId;
        this.balance = 0;
    }

    public abstract void monthlyUpdate();

    public void withdraw(float value) {
        if (value > this.balance) {
            System.out.println("fail: saldo insuficiete");
        } else {
            this.balance -= value;
        }
    }

    public void deposit(float value) {
        this.balance += value;
    }

    public void transfer(Account other, float value) {
        if (this.balance >= value) {
            other.deposit(value);
            this.balance -= value;
        } else {
            System.out.println("Fail: não há saldo disponível para fazer essa transferência");
        }
    }

    public String toString() {
        Locale.setDefault(Locale.US);
        DecimalFormat balance = new DecimalFormat();
        balance.setMinimumFractionDigits(2);
        return this.id + ":" + this.clientId + ":" + balance.format(this.balance) + ":" + this.type;
    }

    public int getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    public String getClientId() {
        return clientId;
    }

    public String getType() {
        return type;
    }
}
