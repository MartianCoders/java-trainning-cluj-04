public class Main {
    public static void main(String[] args) {
        fightInit();
    }

    public static void fightInit() {
        Fighter f1 = new Fighter("Alex", 88, 2);
        Fighter f2 = new Fighter("Andrei", 100, 2);
        BoxingMatch boxingMatch = new BoxingMatch(f1, f2);
        System.out.println(boxingMatch.fight());

    }

}
