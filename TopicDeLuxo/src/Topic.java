import java.util.ArrayList;
public class Topic {
    private ArrayList<Pass> prioritySeats = new ArrayList<>();
    private ArrayList<Pass> normalSeats = new ArrayList<>();
    public Topic(int capacity, int qtdPriority) {
        for (int i = 0; i <= (capacity - qtdPriority) - 1; i++) {
            this.normalSeats.add(i, null);
        }

        for (int i = 0; i <= qtdPriority - 1 ; i++) {
            this.prioritySeats.add(i, null);
        }
    }

    private int findFirstFreePos(ArrayList<Pass> list) {
        int indice = -1;
        indice = list.indexOf(null);

        return indice;
    }
    private int findByName(String name, ArrayList<Pass> list) {
        int encontrado = -1;

        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) != null) {
                if (list.get(i).getName().equals(name)) {
                    encontrado = i;
                    break;
                }
            }
        }

        return encontrado;
    }

    private boolean insertOnList(Pass pass, ArrayList<Pass> list) {
        if (findFirstFreePos(list) != -1) {
            list.set(findFirstFreePos(list), pass);
            return true;
        } else {
            return false;
        }
    }

    private boolean removeFromList(String name, ArrayList<Pass> list) {
        if (findByName(name, list) != -1) {
            int indice = findByName(name, list);
            list.remove(indice);
            list.add(indice, null);
            return true;
        } else {
            return false;
        }
    }

    public boolean insert(Pass pass) {
        if (findByName(pass.getName(), this.prioritySeats) != - 1 || findByName(pass.getName(), this.normalSeats) != -1) {
            System.out.println("fail: pessoa ja esta na topic");
            return false;
        } else if (pass.isPriority()) {
            if (findFirstFreePos(this.normalSeats) == -1 && findFirstFreePos(this.prioritySeats) == -1) {
                System.out.println("fail: topic lotada");
                return false;
            } else if (!insertOnList(pass, this.prioritySeats)) {
                insertOnList(pass, this.normalSeats);
            }
            return true;
        } else {
            if (findFirstFreePos(this.normalSeats) == -1 && findFirstFreePos(this.prioritySeats) == -1) {
                System.out.println("fail: topic lotada");
                return false;
            } else if (!insertOnList(pass, this.normalSeats)) {
                insertOnList(pass, this.prioritySeats);
            }
            return true;
        }
    }

    public boolean remove(String name) {
        boolean removido = false;

        for (int i = 0; i <= this.prioritySeats.size() - 1; i++) {
            if (this.prioritySeats.get(i) != null) {
                if (this.prioritySeats.get(i).getName().equals(name)) {
                    removeFromList(name, this.prioritySeats);
                    removido = true;
                }
            }
        }

        for (int i = 0; i <= this.normalSeats.size() - 1; i++) {
            if (this.normalSeats.get(i) != null) {
                if (this.normalSeats.get(i).getName().equals(name)) {
                    removeFromList(name, this.normalSeats);
                    removido = true;
                }                
            }
        }

        if (removido == false) {
            System.out.println("fail: pass nao esta na topic");
        }

        return removido;
    }

    String normalString() {
        String msgNormal = "";

        if (this.normalSeats.get(0) != null) {
            msgNormal = "=" + this.normalSeats.get(0).toString() + " ";
        } else {
            msgNormal = "= ";
        }

        for (int i = 1; i <= this.normalSeats.size() - 1; i++) {
            if (i == this.normalSeats.size() - 1) {
                if (this.normalSeats.get(i) == null) {
                    msgNormal += "=";
                } else {
                    msgNormal += "=" + this.normalSeats.get(i);
                }
            } else {
                if (this.normalSeats.get(i) == null) {
                    msgNormal += "= ";
                } else {
                    msgNormal += "=" + this.normalSeats.get(i) + " ";
                }                
            }
        }
        return msgNormal;
    }

    String priorityString() {
        String msgPriority = "";

        if (this.prioritySeats.get(0) != null) {
            msgPriority = "@" + this.prioritySeats.get(0).toString() + " ";
        } else {
            msgPriority = "@ ";
        }

        for (int i = 1; i <= this.prioritySeats.size() - 1; i++) {
            if (this.prioritySeats.get(i) == null) {
                msgPriority += "@ ";
            } else {
                msgPriority += "@" + this.prioritySeats.get(i) + " ";
            }
        }
        return msgPriority;
    }

    public String toString() {
        if (this.prioritySeats.size() == 0 && this.normalSeats.size() == 0) {
            return "[" + "]";
        } else {
            return "[" + priorityString() + normalString() + "]";
        }
    } 
}
