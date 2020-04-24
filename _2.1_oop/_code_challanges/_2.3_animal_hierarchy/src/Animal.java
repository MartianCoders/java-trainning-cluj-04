abstract class Animal {
    protected Integer legs;

    protected Animal() {}
    protected Animal(Integer legs) {
        this.legs = legs;
    }

    void walk() {
        System.out.println("This animal uses "+ this.legs+" legs to walk");
    }

    abstract void eat();
}
