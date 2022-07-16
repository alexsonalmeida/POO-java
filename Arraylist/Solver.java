import java.util.Scanner;
import java.util.ArrayList;

public class Solver {
    public static void main(String[] args) {
        ArrayList<Integer> vet = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        while(true) {
            String line = scan.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            String cmd = ui[0];

            if (line.equals("end")) {
                break;
            } else if(cmd.equals("show")) {
                System.out.print("[ ");
                for(Integer value : vet)
                    System.out.print(value + " ");
                System.out.print("]\n");
            } else if(cmd.equals("rshow")) {
                System.out.print("[ ");
                for (int i = vet.size() - 1; i >= 0; i--) {
                    System.out.print(vet.get(i) + " ");
                }
                System.out.print("]\n");
            } else if(cmd.equals("add")) {
                for(int i = 1; i < ui.length; i++)
                    vet.add(Integer.parseInt(ui[i]));
            } else if(cmd.equals("find")) {
                System.out.print("[ ");
                for (int i = 1; i < ui.length; i++) {
                    int n = Integer.parseInt(ui[i]);
                    if (vet.contains(n)) {
                        System.out.print(vet.indexOf(n) + " ");
                    } else {
                        System.out.print("-1");
                    }
                }
                System.out.print("]\n");
            } else if(cmd.equals("get")) {
                int n = Integer.parseInt(ui[1]);
                System.out.print(vet.get(n) + "\n");
            } else if(cmd.equals("set")) {
                int n = Integer.parseInt(ui[1]);
                int n2 = Integer.parseInt(ui[2]);
                vet.remove(n);
                vet.add(n, n2);
            } else if(cmd.equals("ins")) {
                int n = Integer.parseInt(ui[1]);
                int n2 = Integer.parseInt(ui[2]);
                if (n >= 0 && n >= vet.size()) {
                    vet.add(n2);
                } else if (n >= 0 && n < vet.size()) {
                    vet.add(vet.get(vet.size()-1));

                    for (int i = vet.size() - 2; i > n; i--) {
                        vet.set(i, vet.get(i-1));
                    }
                    
                    vet.add(n, n2);
                    vet.remove(n + 1);
                }
            } else if(cmd.equals("rmi")) {
                int n = Integer.parseInt(ui[1]);
                if (n >= 0 && n < vet.size()) {
                    vet.remove(n);
                } else {
                    System.out.println("Fail: indice não encontrado");
                }
            } else if(cmd.equals("rma")) {
                int n = Integer.parseInt(ui[1]);
                while(vet.contains(n)) {
                    for (int i = 0; i < vet.size(); i++) {
                        if (vet.get(i) == n) {
                            vet.remove(i);
                        }
                    }
                }
            } else {
                System.out.print("fail: command not found\n");
            }
        }
        scan.close();
    }

}
