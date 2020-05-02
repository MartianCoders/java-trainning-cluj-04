public class Apartment {
    private String location;
    private int rentCost;

    Apartment(String location, int rentCost) {
        this.location = location;
        this.rentCost = rentCost;
    }

    public int getRentCost() {
        return rentCost;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "AP: " + location + ", cost: " + rentCost;
    }
}
