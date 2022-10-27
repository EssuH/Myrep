abstract public class AFuelCar extends ACar {

    protected String fuelType;
    protected int kmPrLitre;



    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.fuelType = fuelType;
        this.kmPrLitre = kmPrLitre;
    }



    public abstract String getFuelType();
    //should return Gasoline or Diesel.



    public abstract int getKmPrLitre();
    // should return how many km the car can drive on 1 litre of fuel.



    @Override
    public String toString() {
        return super.toString()+ "Fuel type of the car is : " + fuelType + " and it runs : " + kmPrLitre + "km. per. liter.";
    }
}