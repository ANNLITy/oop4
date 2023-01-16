public abstract class Driver {
    public String fio;
    public String driversLicense;
    public String experience;

    @Override
    public String toString() {
        return "Водитель " + fio ;
    }

    public Driver(String fio, String driversLicense, String experience) {
        this.fio = fio;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }
    public void start() {

    }
    public void stop(){

    }
    public void refuel(){

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        String Default = "default";
        if (fio == null || fio.equals("")) {
            this.fio = Default;
        } else {
            this.fio = fio;
        }
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        String Default = "default";
        if (driversLicense == null || driversLicense.equals("")) {
            this.driversLicense = Default;
        } else {
            this.driversLicense = driversLicense;
        }
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        String Default = "default";
        if (experience == null || experience.equals("")) {
            this.experience = Default;
        } else {
            this.experience = experience;
        }
    }
}
