import java.util.LinkedList;

public class Trampoline {
    private LinkedList<Kid> waiting;
    private LinkedList<Kid> playing;

    public Trampoline() {
        this.waiting = new LinkedList<Kid>();
        this.playing = new LinkedList<Kid>();
    }

    private Kid remove_kid(String name, LinkedList<Kid> list) {
        Kid crianca = new Kid(name, 0);

        for (int i = 0; i < list.size() - 1; i++) {
            if (name.equals(list.get(i).toString())) {
                crianca = list.get(i);
                list.remove(i);
            } 
        }

        return crianca;
    }

    public void arrive(Kid kid) {
        this.waiting.add(0, kid);  
    }

    public void in() {
        this.playing.add(0, this.waiting.getLast());
        this.waiting.removeLast();
    }

    public void out() {
        this.waiting.add(0, this.playing.getLast());
        this.playing.removeLast();
    }

    public Kid remove(String name) {
        Kid crianca = new Kid(name, 0);

        if (this.waiting.size() != 0) {
            if (this.waiting.get(0).getName().equals(crianca.getName())) {
                this.waiting.remove(0);
            }

            if (this.waiting.size() > 1) {
                for (int i = 1; i <= this.waiting.size() - 1; i++) {
                    if (this.waiting.get(i).getName().equals(crianca.getName())) {
                        crianca = remove_kid(name, this.waiting);
                        this.waiting.remove(i);
                        break;
                    }
                }
            }            
        }

        if (this.playing.size() != 0) {
            if (this.playing.get(0).getName().equals(crianca.getName())) {
                this.playing.remove(0);
            }

            if (this.playing.size() > 1) {
                for (int i = 1; i <= this.playing.size() - 1; i++) {
                    if (this.playing.get(i).getName().equals(crianca.getName())) {
                        crianca = remove_kid(name, this.playing);
                        this.playing.remove(i);
                        break;
                    }
                }            
            }            
        }

        return crianca;
    }

    private String listWaiting() {
        String listWaiting = null;
        listWaiting = this.waiting.get(0).toString();

        if (this.waiting.size() > 1) {
            for (int i = 1; i <= this.waiting.size() - 1; i++ ) {
                listWaiting += this.waiting.get(i);
            }
        }
        return listWaiting;
    }

    private String listPlaying() {
        String listPlaying = null;
        listPlaying = this.playing.get(0).toString();

        for (int i = 1; i <= this.playing.size() - 1; i++) {
            listPlaying += this.playing.get(i);
        }

        return listPlaying;
    }

    public String toString() {
        if (this.waiting.size() == 0 && this.playing.size() == 0) {
            return "" + "=> [" + " ]";
        } else if (this.waiting.size() == 0 && this.playing.size() != 0) {
            return "" + "=>" + "[ " + this.listPlaying()+ " ]";
        } else if (this.playing.size() == 0 && this.waiting.size() != 0) {
            return "=> " + this.listWaiting() + "=> " + "[ " + " ]";
        } else {
            return "=> " + this.listWaiting() + "=> " + "[ " + this.listPlaying()+ " ]";
        }
    }

    public static void main(String[] args) {
            
        //case unico
        Trampoline trampoline = new Trampoline();
        trampoline.arrive(new Kid("mario", 5));
        trampoline.arrive(new Kid("livia", 4));
        trampoline.arrive(new Kid("luana", 3));
        System.out.println(trampoline);
        //=> luana:3 livia:4 mario:5 => [ ]

        //case entrando
        trampoline.in();
        System.out.println(trampoline);
        //=> luana:3 livia:4 => [ mario:5 ]
        trampoline.in();
        System.out.println(trampoline);
        //=> luana:3 => [ livia:4 mario:5 ]

        //case saindo
        trampoline.out();
        System.out.println(trampoline);
        //=> mario:5 luana:3 => [ livia:4 ]
    }
}
