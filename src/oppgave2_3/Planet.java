package oppgave2_3;

public class Planet {
    private String name;
    private  double radius;
    private double mass;

    public Planet(String name, double radius, double mass){
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        if (newRadius > 0){
            this.radius = newRadius;
        } else {
            throw new IllegalArgumentException("Radius må være positiv tall");
        }
    }

    public double getMass(){
        return mass;
    }
    public void setMass(double newMass){
        if (newMass > 0){
            this.mass = newMass;
        } else {
            throw new IllegalArgumentException("Masse må være positiv tall");
        }
    }
}
