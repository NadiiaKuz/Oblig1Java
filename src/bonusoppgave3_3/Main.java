package bonusoppgave3_3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Planet> planeter = new ArrayList<Planet>();

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--------------\n");

            System.out.println("Hva vil du? 1-vise/ 2-slette/ 3-oppdatere/ 4-registrere/ 5-exit: ");
            int choise = scanner.nextInt();

            switch (choise){
                case 1:
                    for (int i=0;i< planeter.size();i++){
                        System.out.printf("Planeten %s har en radius på %s km og en masse på %s kg", planeter.get(i).getName(), planeter.get(i).getRadius(), planeter.get(i).getMass());
                    }
                    break;
                case 2:
                    System.out.println("Hvilke planet vil du slette?: ");
                    String sletPlanet = scanner.nextLine();
                    for (int i=0; i< planeter.size();i++){
                        if (Objects.equals(planeter.get(i).getName(), sletPlanet)){
                            planeter.remove(i);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Hvilke planet vil du oppdatere?: ");
                    String oppdatertPlanet = scanner.nextLine();
                    for (int i=0; i< planeter.size();i++){
                        if (Objects.equals(planeter.get(i).getName(), oppdatertPlanet)){
                            System.out.println("Skriv inn ny navn på planeten: ");
                            String inputName = scanner.nextLine();

                            System.out.println("Skriv inn ny radius til planeten: ");
                            double inputRadius = scanner.nextDouble();

                            System.out.println("Skriv inn ny massen til planeten: ");
                            double inputMass = scanner.nextDouble();

                            Planet oppdaterPlanet = new Planet(inputName, inputRadius, inputMass);
                            planeter.set(i, oppdaterPlanet);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Skriv inn navn på planeten: ");
                    String inputName = scanner.nextLine();

                    System.out.println("Skriv inn radius til planeten: ");
                    double inputRadius = scanner.nextDouble();

                    System.out.println("Skriv inn massen til planeten: ");
                    double inputMass = scanner.nextDouble();
                    scanner.nextLine();

                    planeter.add(new Planet(inputName, inputRadius, inputMass));

                    System.out.println("Planet er registrert");
                case 5:
                    isRunning = false;
                    break;
            }
        }
    }
}
