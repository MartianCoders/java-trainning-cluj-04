public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public Fighter getFighter1() {
        return fighter1;
    }

    public Fighter getFighter2() {
        return fighter2;
    }

    public String fight() {
        do {
            fighter1.setHealth(fighter1.getHealth() - fighter2.getDamagePerAttack());
            fighter2.setHealth(fighter2.getHealth() -fighter1.getDamagePerAttack());
        } while(fighter1.getHealth() > 0 && fighter2.getHealth() > 0);

        if(fighter1.getHealth() <= 0 && fighter2.getHealth() <= 0)
            return "Remiza";
        else if(fighter1.getHealth() <= 0)
            return fighter2.getName();
        else
            return fighter1.getName();
    }
}
