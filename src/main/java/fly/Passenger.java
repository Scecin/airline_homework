package fly;

public class Passenger {

    private String name;
    private int numberOfBags;
    private double baggageWeight;

    public Passenger(String name, int numberOfBags, double baggageWeight) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.baggageWeight = baggageWeight;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setNumberOfBags(int newNumberOfBags) {
        this.numberOfBags = newNumberOfBags;
    }

    public double getBaggageWeight() {
        return this.baggageWeight;
    }
}
