import java.util.Random;
import java.util.Scanner;

public class App {
    static boolean isRight(int target, int check) {
        if (target == check) return true;
        else {
            checkResult(target, check);
            return false;  
        } 
    }

    static void checkResult(int target, int check) {
        if (target > check) System.out.println("O alvo é maior");
        else System.out.println("O alvo é menor");
    }

    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int target = rand.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int check = 0;

        do {
            check = scan.nextInt();
        } while (!isRight(target, check));
        
        System.out.println("Você acertou!");
        scan.close();
    }
}
