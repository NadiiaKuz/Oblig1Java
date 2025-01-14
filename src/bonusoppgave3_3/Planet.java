package bonusoppgave3_3;

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
        this.radius = newRadius;
    }

    public double getMass(){
        return mass;
    }
    public void setMass(double newMass){
        this.mass = newMass;
    }
}
