public class Spider extends Animal {

    protected Spider() {
        super.legs = 8;
    }

    @Override
    void eat() {
        System.out.println("Spider eat");
    }
}
