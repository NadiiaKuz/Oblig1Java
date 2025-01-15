package bonusoppgave3_2;

import oppgave2_3.Planet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Skriv inn navn på planeten: ");
            String inputName = scanner.nextLine();

            System.out.println("Skriv inn radius til planeten: ");
            double inputRadius = scanner.nextDouble();

            System.out.println("Skriv inn massen til planeten: ");
            double inputMass = scanner.nextDouble();
            scanner.nextLine();

            Planet planet = new Planet(inputName, inputRadius, inputMass);

            System.out.printf("Planeten %s har en radius på %.2f km og en masse på %.2E kg",
                    planet.getName(), planet.getRadius(), planet.getMass());

            System.out.println("\n--------------\n");

            System.out.println("Vil du fortsette? Y/N: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("n")){
                break;
            }
        }

        scanner.close();
    }
}
