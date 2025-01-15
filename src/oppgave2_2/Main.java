package oppgave2_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double moonGravity = 16.5 / 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv vekten din (kg): ");
        int userInput =scanner.nextInt();

        double moonVekt = userInput * moonGravity;

        System.out.printf("Din vekt på månen er: %.2f%n", moonVekt);

        scanner.close();
    }
}
