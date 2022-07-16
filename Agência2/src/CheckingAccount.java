class CheckingAccount extends Account {
    public CheckingAccount(int id, String idClient) {
        super(id, idClient);
        this.type = "CC";
    }

    @Override
    public void monthlyUpdate() {
        this.balance -= 20;
    }
}
