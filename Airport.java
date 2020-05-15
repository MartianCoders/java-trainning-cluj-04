import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String IATA;
    private String city;
    private String country;
    private boolean militaryAirport;
    private boolean governmentAirport;
    private boolean luggageService;

    public Airport(Builder builder) {
        this.IATA = builder.IATA;
        this.city = builder.city;
        this.country = builder.country;
        this.militaryAirport = builder.militaryAirport;
        this.governmentAirport = builder.governmentAirport;
        this.luggageService = builder.luggageService;
    }

    public String getIATA() {
        return IATA;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public boolean getMilitaryAirport() {
        return militaryAirport;
    }

    public boolean getGovAirport() {
        return governmentAirport;
    }

    public boolean getLuggageService() {
        return luggageService;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("<").append(IATA).append("> ").append(" ").append(city).append(", ").append(country);
        if(luggageService)
            string.append(", Luggage Service: Yes");
        if(militaryAirport)
            string.append(", \033[0;33mMilitary Airport\033[0m");
        if(governmentAirport)
            string.append(", \033[0;34mGovernment Airport\033[0m");

        return string.toString();
    }

    public static class Builder {
        private String IATA;
        private String city;
        private String country;
        private boolean militaryAirport;
        private boolean governmentAirport;
        private boolean luggageService;

        public Builder(String IATA, String city, String country) {
            this.IATA = IATA;
            this.city = city;
            this.country = country;
        }

        public Builder setMilitaryAirport() {
            this.militaryAirport = true;
            return this;
        }

        public Builder setGovernmentAirport() {
            this.governmentAirport = true;
            return this;
        }

        public Builder setLuggageService() {
            this.luggageService = true;
            return this;
        }

        public Airport build() {
            return new Airport(this);
        }
    }
}
