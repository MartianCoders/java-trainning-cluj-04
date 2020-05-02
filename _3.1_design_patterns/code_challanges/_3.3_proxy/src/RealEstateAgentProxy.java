import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {
    private List<Apartment> list = new ArrayList<Apartment>();

    public List<Apartment> getList() {
        return list;
    }

    public void represent(Apartment ap) {
        this.list.add(ap);
    }

    public Apartment rent(Student student) {
        String name = student.getName();
        int money = student.getMoney();
        if((!(name.contains("P")) || !(name.contains("p")))) {
            for (Apartment apartment : list)
                if (apartment.getRentCost() < money)
                    return apartment;
        }
        return null;
    }
}
