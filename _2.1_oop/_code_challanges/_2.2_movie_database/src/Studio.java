import java.util.Arrays;
import java.util.Objects;

public class Studio {
    String nume;
    Film[] film;

    Studio(String nume, Film[] film) {
        this.nume = nume;
        this.film = film;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilm() {
        return film;
    }

    public int getSize() {
        return film.length;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setFilm(Film[] film) {
        this.film = film;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studio studio = (Studio) o;
        return Objects.equals(nume, studio.nume) &&
                Arrays.equals(film, studio.film);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, film);
    }

    @Override
    public String toString() {
        return "Studio{" +
                "nume='" + nume + '\'' +
                ", film=" + Arrays.toString(film) +
                '}';
    }
}
