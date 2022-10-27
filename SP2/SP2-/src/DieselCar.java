public class DieselCar extends AFuelCar {

    private boolean particleFilter;
    private int registrationFee;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, fuelType, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType() {
        return getFuelType();
    }

    @Override
    public int getKmPrLitre() {
        return kmPrLitre;
    }


    public boolean hasParticleFilter() {
        return particleFilter;
    }

    int particleFilterFee = 0;

    public int getRegistrationFee() {
        int kmPrLitre = this.getKmPrLitre();
        int xtraFee = 0;

        if (kmPrLitre < 50 && kmPrLitre >= 20) {
            xtraFee = 130;
            registrationFee = 330;}

        else if (kmPrLitre < 20 && kmPrLitre >= 15) {
            xtraFee = 1390;
            registrationFee = 1050;}

        else if (kmPrLitre < 15 && kmPrLitre >= 10) {
            xtraFee = 1850;
            registrationFee = 2340;}

        else if (kmPrLitre < 10 && kmPrLitre >= 5) {
            xtraFee = 2770;
            registrationFee = 5500;}

        else if (kmPrLitre < 5) {
            xtraFee = 15260;
            registrationFee = 10470;}



        if (!particleFilter) {
            particleFilterFee = 1000;}


        return registrationFee + xtraFee + particleFilterFee;
    }


    @Override
    public String toString() {
        if (particleFilter) {
            return super.toString() + "This car has particle filter";
        }
        return super.toString();
    }
}