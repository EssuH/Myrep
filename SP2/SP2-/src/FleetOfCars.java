import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car>fleet = new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int totalRegistrationFeeForFleet = 0;
            for (Car c : fleet) {
            totalRegistrationFeeForFleet += c.getRegistrationFee();
            }
        return totalRegistrationFeeForFleet;
    }

    public String toString(){
        return fleet.toString();
    }

}
