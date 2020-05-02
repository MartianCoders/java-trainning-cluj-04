public class Person {
    private String name;
    private String job;
    private String univ;
    private boolean drivingLicense;
    private boolean isMarried;

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.univ = builder.univ;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniv() {
        return univ;
    }

    public boolean getDrivingLicense() {
        return drivingLicense;
    }

    public boolean getMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return name + ", " + job + ", " + univ + ", " + drivingLicense+ ", " + isMarried;
    }

    public static class Builder {
        private String name;
        private String job;
        private String univ;
        private boolean drivingLicense;
        private boolean isMarried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniv(String univ) {
            this.univ = univ;
            return this;
        }

        public Builder setDrivingLicense(boolean driving) {
            this.drivingLicense = driving;
            return this;
        }

        public Builder setMarried(boolean married) {
            this.isMarried = married;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
