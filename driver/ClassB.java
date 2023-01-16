public class ClassB extends Driver {
    public String licenseB;

    public String getLicenseB() {
        return licenseB;
    }

    public void setLicenseB(String licenseB) {
        String Default = "default";
        if (licenseB == null || licenseB.equals("")) {
            this.licenseB = Default;
        } else {
            this.licenseB = licenseB;
        }
    }

    public ClassB(String fio, String driversLicense, String experience,String licenseB) {
        super(fio, driversLicense, experience);
        this.licenseB=licenseB;
    }
}


