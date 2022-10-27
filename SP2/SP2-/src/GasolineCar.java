public class GasolineCar extends AFuelCar{

    private int registrationFee;

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, fuelType, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return this.fuelType;
    }

    @Override
    public int getKmPrLitre() {
        return this.kmPrLitre;
    }


    public int getRegistrationFee(){
        int kmPrLitre = this.getKmPrLitre();

        if(kmPrLitre < 50 && kmPrLitre >= 20){
            registrationFee = 330;
        }

        else if(kmPrLitre < 20 && kmPrLitre >= 15){
            registrationFee = 1050;
        }

        else if(kmPrLitre < 15 && kmPrLitre >= 10){
            registrationFee = 2340;
        }

        else if(kmPrLitre < 10 && kmPrLitre >= 5) {
            registrationFee = 5500;
        }

        else if(kmPrLitre < 5) {
            registrationFee = 10470;
        }



        return registrationFee;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
