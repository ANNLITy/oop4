import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bus busOne = new Bus("", " M6 ", 1, 2, 3, "", 2);
        System.out.println(Arrays.toString(busOne.getPitStop()));
        LightCar carOne = new LightCar(" "," x6 ",2,"","",2,2);
        System.out.println(Arrays.toString(carOne.getBestTime()));
        HeavyCar carTwo = new HeavyCar(""," A6 ",3,"","",2,2);
        System.out.println(Arrays.toString(carTwo.getMaxSpeed()));
        ClassB driverOne = new ClassB("Антонов Антон Антонович","","","");
        ClassC driverTwo = new ClassC("Андреев Андрей Андреевич","","");
        ClassD driverThree= new ClassD("Алексеев Алексей Алексеевич","","");
        carOne.drive(driverOne);
        carTwo.drive(driverTwo);
        busOne.drive(driverThree);










    }
}
