package singleton;

import java.util.ArrayList;
import component.PaoFrances;

public class DataBase {
    static ArrayList<PaoFrances> listPao = null;

    private DataBase() {}

    public static ArrayList<PaoFrances> getIstance() {
        if (listPao == null) {
            listPao = new ArrayList<>();
            return listPao;
        }

        return listPao;
    } 
}
