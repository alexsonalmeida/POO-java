class SavingsAccount extends Account {
    public SavingsAccount(int id, String idClient) {
        super(id, idClient);
        this.type = "CP";        
    }

    @Override
    public void monthlyUpdate() {
        this.balance += (this.balance * 1/100);
    }
}