public class Fish extends Animal implements Pet {
    Fish() {
        super.legs = 0;
    }

    public void walk() {
        System.out.println(false);
    }

    @Override
    void eat() {
        System.out.println("Fish eat");
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String string) {

    }

    @Override
    public void play() {

    }
}
