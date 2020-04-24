public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
        super.legs = 4;
    }

    public Cat() {
        new Cat("");
    }

    @Override
    void eat() {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat play");
    }
}
