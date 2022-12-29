import interfaces.Observable;
import interfaces.Observer;

public class MamaeDragao implements Observer {
    private String estado = "Dormindo";

    @Override
    public void notifyObserver(Observable objectObservable) {
        this.estado = "Acordado";
    }

    public String getEstado() {
        return estado;
    }
}
