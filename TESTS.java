
public class TESTS {
    private Plane p1 = new Plane.Builder(154, "LAX", "LVS").setMaxPassengers(400).setNeedsLugageDistribution().build();
    private Plane p2 = new Plane.Builder(76, "LAX", "WSG").setMilitaryPlane().build();
    private Plane p3 = new Plane.Builder(286,"JFK", "WSG").setMaxPassengers(300).setEmergenyLanding().build();
    private Plane p4 = new Plane.Builder(500,"LVS", "WSG").setGovPlane().build();

    private Airport a1 = new Airport.Builder("LAX", "Los Angeles", "USA").setLuggageService().build();
    private Airport a2 = new Airport.Builder("WSG", "Washington", "USA").setLuggageService().setGovernmentAirport().build();
    private Airport a3 = new Airport.Builder("LVS","Las Vegas","USA").setMilitaryAirport().build();

    public boolean test_planes() {
        return p1.getID() == 154
                && p1.getFromAirport().equals("LAX")
                && p1.getToAirport().equals("LVS")
                && p1.getMaxPassengers() == 400
                && p1.getNeedsLugageDistribution();
    }

    public boolean test_airport() {
        return a1.getIATA().equals("LAX")
                && a1.getCity().equals("Los Angeles")
                && a1.getCountry().equals("USA")
                && a1.getLuggageService();
    }

    public boolean test_planeCollection() {
        PlaneCollection planeCollection = new PlaneCollection();
        planeCollection.add(p1);
        planeCollection.add(p2);
        planeCollection.add(p3);
        planeCollection.add(p4);

        PlaneIterator planeIterator = (PlaneIterator) planeCollection.iterator();
        int counter = 0;
        while(planeIterator.hasNext()) {
            Plane plane = planeIterator.next();
            if(plane == p1 || plane == p2 || plane == p3 || plane == p4)
                counter++;
        }

        return counter == 4;
    }

    public boolean test_airportCollection() {
        AirportCollection airportCollection = new AirportCollection();
        airportCollection.add(a1);
        airportCollection.add(a2);
        airportCollection.add(a3);

        AirportIterator airportIterator = (AirportIterator) airportCollection.interator();
        int counter = 0;
        while(airportIterator.hasNext()) {
            Airport airport = airportIterator.next();
            if(airport == a1 || airport == a2 || airport == a3)
                counter++;
        }

        return counter == 3;
    }

    public void test_all() {
        if(!test_planes())
            System.out.println("test_planes error");
        if(!test_airport())
            System.out.println("test_airport error");
        if(!test_planeCollection())
            System.out.println("test_planeCollection error");
        if(!test_airportCollection())
            System.out.println("test_airportCollection error");
    }
}
