public class Main {
    public static void main(String[] args) {
        Person p1 = new Person.Builder("Alex01").build();
        System.out.println(p1);
        Person p2 = new Person.Builder("Alex02").setJob("Chelner").build();
        System.out.println(p2);
        Person p3 = new Person.Builder("Alex03").setUniv("UBB").setJob("Chelner").build();
        System.out.println(p3);
        Person p4 = new Person.Builder("Alex04").setJob("Chelner").setUniv("UBB").setDrivingLicense(true).setMarried(false).build();
        System.out.println(p4);
    }
}
