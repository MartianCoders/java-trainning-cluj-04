public class Student {
    private String name;
    private int money;

    Student (String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "St: " + name + ", money: " + money;
    }
}
