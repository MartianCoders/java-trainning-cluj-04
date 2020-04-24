import java.util.Arrays;
import java.util.Objects;

public class Actor {
    String nume;
    Integer varsta;
    Premiu[] premiu;

    Actor(String nume, Integer varsta, Premiu[] premiu) {
        this.nume = nume;
        this.varsta = varsta;
        this.premiu = premiu;
    }

    public String getNume() {
        return nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public Premiu[] getPremiu() {
        return premiu;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPremiu(Premiu[] premiu) {
        this.premiu = premiu;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(nume, actor.nume) &&
                Objects.equals(varsta, actor.varsta) &&
                Arrays.equals(premiu, actor.premiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, varsta, premiu);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", premiu=" + Arrays.toString(premiu) +
                '}';
    }
}
