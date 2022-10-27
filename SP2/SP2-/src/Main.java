public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        Car car1 = new GasolineCar("BL73931", "Nissan", "Note",  5, "Gas", 25);
        Car car2 = new DieselCar("BD66273", "BMW", "M4", 5, "Diesel", 15, true);
        Car car3 = new ElectricCar("KU82377", "Tesla", "Model X", 5, 600, 100);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        System.out.println(fleet);

        System.out.println("The total fee cost is  " + fleet.getTotalRegistrationFeeForFleet());


    }
}