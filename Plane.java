class Plane {
    private Integer ID;
    private String fromAirport;
    private String toAirport;
    private boolean privatePlane;
    private boolean militaryPlane;
    private boolean govPlane;
    private Integer maxPassengers;
    private boolean needsLugageDistribution;
    private boolean emergencyLanding;


    public Plane(Builder builder) {
        this.ID = builder.ID;
        this.fromAirport = builder.fromAirport;
        this.toAirport = builder.toAirport;
        this.privatePlane = builder.privatePlane;
        this.govPlane = builder.govPlane;
        this.militaryPlane = builder.militaryPlane;
        this.maxPassengers = builder.maxPassengers;
        this.needsLugageDistribution = builder.needsLugageDistribution;
        this.emergencyLanding = builder.emergenyLanding;
    }

    public Integer getID() {
        return ID;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public Integer getMaxPassengers() {
        return maxPassengers;
    }

    public boolean getmilitaryPlane() {
        return militaryPlane;
    }

    public boolean getNeedsLugageDistribution() {
        return needsLugageDistribution;
    }

    public boolean getEmergencyLanding() {
        return emergencyLanding;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("~ ").append(ID).append(" | ").append(fromAirport).append(" <-> ").append(toAirport).append(", Needs L.S.: ").append(needsLugageDistribution);
        if(maxPassengers > 0)
            string.append(", Capacity: ").append(maxPassengers);
        if(privatePlane)
            string.append(", Priavte: true");
        if(militaryPlane)
            string.append(", \033[0;33mMilitary Plane\033[0m");
        if(govPlane)
            string.append(", \033[0;34mGovernment Plane\033[0m");
        if(emergencyLanding)
            string.append(", \033[0;31mEMERGENCY LANDING\033[0m");

        return string.toString();
    }

    public static class Builder {
        private Integer ID;
        private String fromAirport;
        private String toAirport;
        private boolean privatePlane;
        private boolean militaryPlane;
        private boolean govPlane;
        private Integer maxPassengers = 0;
        private boolean needsLugageDistribution;
        private boolean emergenyLanding;

        public Builder(Integer ID, String fromAirport, String toAirport) {
            this.ID = ID;
            this.fromAirport = fromAirport;
            this.toAirport = toAirport;
        }

        public Builder setMilitaryPlane() {
            this.militaryPlane = true;
            return this;
        }

        public Builder setMaxPassengers(Integer maxPassengers) {
            this.maxPassengers = maxPassengers;
            return this;
        }

        public Builder setNeedsLugageDistribution() {
            this.needsLugageDistribution = true;
            return this;
        }

        public Builder setEmergenyLanding() {
            this.emergenyLanding = true;
            return this;
        }

        public Builder setPrivatePlane() {
            this.privatePlane = true;
            return this;
        }

        public Builder setGovPlane() {
            this.govPlane = true;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
