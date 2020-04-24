import java.util.Arrays;
import java.util.Objects;

public class Film {
    Integer an;
    String nume;
    Actor[] actor;

    Film(Integer an, String nume, Actor[] actor) {
        this.an = an;
        this.nume = nume;
        this.actor = actor;
    }

    public String getNume() {
        return nume;
    }

    public Integer getAn() {
        return an;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(an, film.an) &&
                Objects.equals(nume, film.nume) &&
                Arrays.equals(actor, film.actor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(an, nume, actor);
    }

    @Override
    public String toString() {
        return "Film{" +
                "an=" + an +
                ", nume='" + nume + '\'' +
                ", actor=" + Arrays.toString(actor) +
                '}';
    }
}
