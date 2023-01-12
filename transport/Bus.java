public class Bus<B extends ClassD> extends Transport implements Competing{

    private int doors;
    private int route;
    private String emergencyExit;
    private int standingPlaces;

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public int setStandingPlaces(int standingPlaces) {
        int Default = 1;
        if (standingPlaces <=0){
            this.standingPlaces = Default;
        }
        return standingPlaces;
    }

    public int getDoors() {
        return doors;
    }

    public int setDoors(int doors) {
        int Default = 1;
        if (doors <=0){
            this.doors = Default;
        }
        return doors;
    }

    public int getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = Integer.parseInt(route);
    }

    public String getEmergencyExit() {
        return emergencyExit;
    }

    public void setEmergencyExit(String emergencyExit) {
        String Default = "default";
        if (emergencyExit == null || emergencyExit.equals("")) {
            this.emergencyExit = Default;
        } else {
            this.emergencyExit = emergencyExit;
        }
    }

    public Bus(String brand, String model, double engineVolume,int doors,int route,String emergencyExit, int standingPlaces) {
        super(brand, model, engineVolume);
        this.doors=doors;
        this.route=route;
        this.emergencyExit=emergencyExit;
        this.standingPlaces=standingPlaces;

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
    public void drive(B classD){
        System.out.println(classD+" управляет автобусом"+ getModel()+ "и будет участвовать в заезде");
    }


}
