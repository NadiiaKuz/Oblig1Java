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
            scanner.nextLine(); // clear the buffer

            switch (choise){
                case 1:
                    for (int i=0;i< planeter.size();i++){
                        System.out.printf("\nPlaneten %s har en radius på %.1f km og en masse på %.2E kg %n",
                                planeter.get(i).getName(), planeter.get(i).getRadius(), planeter.get(i).getMass());
                    }
                    break;
                case 2:
                    boolean foundForRemove = false;
                    System.out.println("Hvilke planet vil du slette?: ");
                    String removePlanet = scanner.nextLine();

                    for (int i=0; i< planeter.size();i++){
                        if (Objects.equals(planeter.get(i).getName(), removePlanet)){
                            foundForRemove = true;
                            planeter.remove(i);
                            System.out.println("Planeten er slettet.");
                        }
                    }
                    if (!foundForRemove){
                        System.out.println("Planeten ble ikke funnet");
                    }
                    break;
                case 3:
                    boolean foundForUpdate = false;
                    System.out.println("Hvilke planet vil du oppdatere?: ");
                    String updatePlanet = scanner.nextLine();

                    for (int i=0; i< planeter.size();i++){
                        if (Objects.equals(planeter.get(i).getName(), updatePlanet)){
                            foundForUpdate = true;
                            planeter.set(i, setNewPlanet(scanner));
                            System.out.println("Planeten er oppdatert");
                        }
                    }
                    if (!foundForUpdate){
                        System.out.println("Planeten ble ikke funnet");
                    }
                    break;
                case 4:
                    planeter.add(setNewPlanet(scanner));
                    System.out.println("Planet er registrert");
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Avslutter programmet");
                    break;
            }
        }

        scanner.close();
    }

    public static Planet setNewPlanet (Scanner scanner){
        System.out.println("Skriv inn navn på planeten: ");
        String inputName = scanner.nextLine();

        System.out.println("Skriv inn radius til planeten: ");
        double inputRadius = scanner.nextDouble();

        System.out.println("Skriv inn massen til planeten: ");
        double inputMass = scanner.nextDouble();
        scanner.nextLine(); // clear the buffer

        return new Planet(inputName, inputRadius, inputMass);
    }
}
