package fly;

public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
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
}
