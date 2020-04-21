import java.util.Objects;

public class Fighter {
    private String name;
    private Integer health;
    private Integer damagePerAttack;

    /* Default constructor (with given info's)*/
    public Fighter(String name, Integer health, Integer damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    /* Get's */
    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getDamagePerAttack() {
        return damagePerAttack;
    }

    /* Set's */

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void setDamagePerAttack(Integer damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damagePerAttack=" + damagePerAttack +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return Objects.equals(name, fighter.name) &&
                Objects.equals(health, fighter.health) &&
                Objects.equals(damagePerAttack, fighter.damagePerAttack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, damagePerAttack);
    }

}
