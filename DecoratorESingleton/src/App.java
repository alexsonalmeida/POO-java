import java.util.ArrayList;

import component.PaoFrances;
import singleton.DataBase;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<PaoFrances>dbPaes = DataBase.getIstance();
        ArrayList<PaoFrances>dbPaes2 = DataBase.getIstance();
        System.out.println(dbPaes.equals(dbPaes2));

        PaoFrances pao = new PaoFrancesComum();

        PaoFrances carne = new Carne(pao);
        System.out.println(carne);

        PaoFrances queijo = new Queijo(carne);
        System.out.println(queijo);

        PaoFrances tomate = new Tomate(queijo);
        PaoFrances alface = new Alface(queijo);
        
        System.out.println(alface);
        System.out.println(tomate);

        dbPaes.add(alface);
        dbPaes.add(tomate);
        
    }
}
