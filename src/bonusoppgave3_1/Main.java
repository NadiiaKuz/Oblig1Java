package bonusoppgave3_1;
import java.util.Scanner;
import oppgave2_3.Planet;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn navn på planeten: ");
        String inputName = scanner.nextLine();

        System.out.println("Skriv inn radius til planeten: ");
        double inputRadius = scanner.nextDouble();

        System.out.println("Skriv inn massen til planeten: ");
        double inputMass = scanner.nextDouble();

        Planet planet = new Planet(inputName, inputRadius, inputMass);

        System.out.printf("Planeten %s har en radius på %s km og en masse på %s kg", planet.getName(), planet.getRadius(), planet.getMass());
    }
}
