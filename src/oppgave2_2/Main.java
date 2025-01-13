package oppgave2_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double moonGravity = 16.5 / 100;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Skriv inn din vekt(kg): ");
        int userInput =myObj.nextInt();

        double moonVekt = userInput * moonGravity;

        System.out.printf("Din vekt på månen er: %.2f%n", moonVekt);
    }
}
