import java.util.Scanner;
import javax.swing.text.AbstractDocument.BranchElement;
import java.util.ArrayList;
import java.util.List;
/*import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;*/
public class Aplicacao {
    public static void main(String[] args) throws Exception {
        // Turista lucas = new Turista("Lucas", 19, Agencia.LOCAL, "beiraMar");
        // Estudante amanda = new Estudante("Amanda", 21, Instituicao.UNIVERSIDADE, "UFC - Quixada");
        // HospedeComum Fransisco = new HospedeComum("Fransisco", 10);
        // Quarto q1 = new Quarto(TipoDeQuarto.QUARTO_FAMILIA);
        // List<Hospede> hospedes = new ArrayList<Hospede>(); 
        // hospedes.add(lucas);
        // hospedes.add(amanda);
        // hospedes.add(Fransisco);
        // q1.addHospede(hospedes);
        // System.out.println(q1);
        // Hotel hotel = new Hotel();
        // hotel.addHospede(lucas, 18);
        // hotel.servicoQuarto(18, ServicoDeQuarto.BUFE);
        // System.out.println(hotel.getHospede(18));
        // System.out.println(hotel.getHospede(18).getCache());
        Hotel hotel = new Hotel();
        Scanner scan = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 6) {
            System.out.println("Menu de opções");
            System.out.println("1. Check-in de hóspedes");
            System.out.println("2. Check-out de hóspedes");
            System.out.println("3. Chamar serviço de quarto");
            System.out.println("6. Sair do sistema");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                //inicialmente, pergunta o tipo de quarto e o tipo de hospede
                //Seria bom dar as opções? (1: hospede x, 2: hospede y)
                System.out.println("Qual o tipo de quarto desejado?");
                System.out.println("Qual o tipo de hospede?");
                break;

                case 2:
                //caucula o cache e chama o desocupar
                break;

                case 3:
                System.out.println("Qual o tipo de seviço quarto desejado?");
                //bom listar o serviços
                break;

                default:
                break;
            }
        }
        scan.close();
    }
}   
