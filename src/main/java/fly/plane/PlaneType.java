package fly.plane;

public enum PlaneType {

    BOEING747(416, 183500),
    A350_900(350, 115700),
    EMBRAER_175(88, 1192);

    private int capacity;
    private int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    // Getters
    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }
}
