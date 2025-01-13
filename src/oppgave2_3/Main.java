package oppgave2_3;

public class Main {
    public static void main(String[] args){
        Planet planet = new Planet("Mars", 3889.5, 6.39E23);

        System.out.printf("Planeten %s har en radius på %s km og en masse på %s kg", planet.getName(), planet.getRadius(), planet.getMass());
    }
}
