public class Motorcycle {
    private Person person; //agregacao
    private int power;
    private int time;

    public Motorcycle(int power) {
        this.power = power;
        this.person = null;
        this.time = 0;
    }

    public void buy(int time) {
        this.time += time;
    }

    public boolean in(Person person) {
        if (this.person != null) {
            System.out.println("Fail: moto ocupada");
            return false;
        } else {
            this.person = person;
            return true;
        }
    }

    public Person out() {
        if (this.person != null) {
            Person per = this.person;
            this.person = null;
            return per;
        } else {
            System.out.println("Fail: moto vazia");
            return null;
        }
    }

    public void drive(int time) {
        if (this.person.getAge() <= 10 && this.time >= time) {
            this.time -= time;
        } else if (this.person.getAge() > 10 && this.time >= time) {
            System.out.println("Muito grande pra andar de moto");
        } else if (this.person.getAge() <= 10 && this.time == 0) {
            System.out.println("Fail: tempo zerado");
        } else if (this.person.getAge() <= 10 && this.time < time){
            System.out.println("Fail: andou " + this.time + " min e acabou o tempo");
            this.time = 0;
        } else if (this.person == null) {
            System.out.println("Fail: moto vazia");
        } else {
            System.out.println("Fail: pessoa não adicionada");
        }
    }

    public void honk() {
        if (this.person != null) {
            System.out.print("p");

            for (int i = 0; i < this.power; i++) {
                System.out.print("e");
            }

            System.out.print("m");
            System.out.println(" ");
        } else {
            System.out.println("Fail: moto vazia");
        }
    }

    public String toString() {
        if (this.person != null) {
            return "power: " + this.power + ", minutos: " + this.time + ", person: [" + this.person.getName() + ":" + this.person.getAge() + "]";
        } else {
            return "power: " + this.power + ", minutos: " + this.time + ", person: null";
        }
    }
}
