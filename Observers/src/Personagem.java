import java.util.ArrayList;

import interfaces.Observable;
import interfaces.Observer;

public class Personagem implements Observable {
    private int ovosColetados;
    private ArrayList<Observer> dragoes;

    public Personagem() {
        this.ovosColetados = 0;
        this.dragoes = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.dragoes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        for (Observer ob : dragoes) {
            if (ob.equals(observer)) {
                this.dragoes.remove(observer);
            }
        }
    }

    @Override
    public void notifyObserves() {
        for (Observer ob : dragoes) {
            ob.notifyObserver(this);
        }      
    }
    
    public void setOvosColetados(int ovosColetados) {
        this.ovosColetados = ovosColetados;
        if (this.ovosColetados >= 100) {
            notifyObserves();
        }
    }
}
