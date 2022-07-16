public class Pet {
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, shower;
    private int diamonds;
    private int age;
    private boolean alive;

    public Pet(int energy, int hungry, int shower) {
        this.energyMax = energy;
        this.hungryMax = hungry;
        this.cleanMax = shower;

        this.energy = this.energyMax;
        this.hungry = this.hungryMax;
        this.shower = this.cleanMax;

        this.age = 0;
        this.diamonds = 0;
        this.alive = true;
    }

    private void setEnergy(int value) {
        if (value <= 0) {
            this.energy = 0;
            System.out.println("fail: pet morreu de fraqueza");
            this.alive = false;
        } else if (value > this.energyMax) {
            this.energy = this.energyMax;
        } else {
            this.energy = value;
        }
    }

    private void setHungry(int value) {
        if (value <= 0) {
            this.hungry = 0;
            System.out.println("Fail: pet morreu de fome");
            this.alive = false;
        } else if (value > this.hungryMax){
            this.hungry = this.hungryMax;
        } else {
            this.hungry = value;
        }
    }

    private void setClean(int value) {
        if (value <= 0) {
            this.shower = 0;
            System.out.println("Fail: pet morreu de sujeira");
            this.alive = false;
        } else if (value > this.cleanMax){
            this.shower = this.cleanMax;
        } else {
            this.shower = value;
        }
    }

    public int getClean() {
        return shower;
    }

    public int getHungry() {
        return hungry;
    }

    public int getEnergy() {
        return energy;
    }

    public int getEnergyMax() {
        return energyMax;
    }

    public int getCleanMax() {
        return cleanMax;
    }

    public int getHungryMax() {
        return hungryMax;
    }

    public boolean testAlive() {
        if (this.alive) {
            return true;
        } else {
            return false;
        }
    }

    public void play() {
        if (testAlive()) {
            setEnergy(getEnergy() - 2);
            setHungry(getHungry() - 1);
            setClean(getClean() - 3);
            this.diamonds++;
            this.age++;
        } else {
            System.out.println("Fail: pet está morto");
        }
    }

    public void eat() {
        if (testAlive()) {
            setEnergy(this.energy - 1);
            setHungry(this.hungry + 4);
            setClean(this.shower - 2);
            this.age++;            
        } else {
            System.out.println("Fail: pet está morto");
        }
    }

    public void shower() {
        if (testAlive()) {
            setEnergy(this.energy - 3);
            setHungry(this.hungry - 1);
            setClean(this.shower + this.cleanMax);
            this.age += 2;            
        } else {
            System.out.println("Fail: pet está morto");
        }
    }

    public void sleep() {
        if (testAlive() && this.energy <= this.energyMax - 5) {
            setEnergy(this.energy + this.energyMax);
            setHungry(this.hungry - 1);
            this.age++;            
        } else if (this.energy > this.energyMax - 5) {
            System.out.println("Fail: não está com sono");
        } else {
            System.out.println("Fail: pet está morto");
        }
    }

    public String toString() {
        return "E:" + this.energy + "/" + this.energyMax + ", S:" + this.hungry + "/" + this.hungryMax + ", L:" + this.shower + "/" + this.cleanMax + ", D:" + this.diamonds + ", I:" + this.age;
    }

}
