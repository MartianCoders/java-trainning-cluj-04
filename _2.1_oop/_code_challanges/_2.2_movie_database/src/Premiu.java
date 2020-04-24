import java.util.Objects;

public class Premiu {
    String nume;
    Integer an;

    Premiu(String nume, Integer an) {
        this.nume = nume;
        this.an = an;
    }

    public Integer getAn() {
        return an;
    }

    public String getNume() {
        return nume;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Premiu premiu = (Premiu) o;
        return Objects.equals(nume, premiu.nume) &&
                Objects.equals(an, premiu.an);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, an);
    }

    @Override
    public String toString() {
        return "Premiu{" +
                "nume='" + nume + '\'' +
                ", an=" + an +
                '}';
    }


}
