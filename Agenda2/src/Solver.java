import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solver {
    static Contact parseContact(String[] ui) {
        return new Contact(ui[1], Arrays.asList(ui).stream()
            .skip(2).map(token -> new Fone(token.split(":")[0], token.split(":")[1]))
            .collect(Collectors.toList()));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        while(true){
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String ui[] = line.split(" ");
            if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("init")) {
                agenda = new Agenda();
            } else if(ui[0].equals("add")) { 
                agenda.addContact(Solver.parseContact(ui));
            } else if(ui[0].equals("rm")) { 
                agenda.rmContact(ui[1]);;
            } else if(ui[0].equals("rmFone")) { 
                agenda.findContact(ui[1]).rmFone(Integer.parseInt(ui[2]));
            } else if(ui[0].equals("show")) {
                System.out.println(agenda);
            } else if(ui[0].equals("search")) {
                System.out.println(agenda.search(ui[1]).stream().map(c -> "" + c).collect(Collectors.joining("\n")));
            } else {
                System.out.println("fail: invalid command");
            }
        }
        scanner.close();
    }
}
