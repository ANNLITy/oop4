public class LightCar<L extends ClassB> extends Transport implements Competing {
    private String body;
    private String transmission;
    private int number;
    private int places;
    public LightCar(String brand, String model, double engineVolume, String body, String transmission, int number, int places) {
        super(brand, model, engineVolume);
        this.body = body;
        this.transmission = transmission;
        this.number = number;
        this.places = places;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        String Default = "default";
        if (body == null || body.equals("")) {
            this.body = Default;
        } else {
            this.body = body;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        String Default = "default";
        if (transmission == null || transmission.equals("")) {
            this.transmission = Default;
        } else {
            this.transmission = transmission;
        }
    }

    public int getNumber() {
        return number;
    }

    public int setNumber(int number) {
        int Default = 1;
        if (number <=0){
            this.number = Default;
        }
        return number;
    }

    public int getPlaces() {
        return places;
    }

    public int setPlaces(int places) {
        int Default = 1;
        if (places <=0){
            this.places = Default;
        }
        return places;
    }
    public void drive(L classB){
        System.out.println(classB+" управляет лёгковым автомобилем"+ getModel()+ "и будет участвовать в заезде");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }



}
