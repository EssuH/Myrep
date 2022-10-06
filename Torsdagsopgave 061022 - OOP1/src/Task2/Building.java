package Task2;

public class Building {

private int Rooms;
private int numberOfBathrooms;
private int numberOfFloors;
String isOfficeBuilding;

public static void Building1() {

    int Rooms = 5;
    int numberOfBathrooms = 2;
    int numberOfFloors = 4;
    String isOfficeBuilding = "Not office building";

    System.out.println("This building has:");
    System.out.println(Rooms + " - Rooms" );
    System.out.println(numberOfBathrooms + " - Bathrooms.");
    System.out.println(numberOfFloors + " - Floors.");
}

    public int getRooms() {
        return this.Rooms;
    }

    public int getNumberOfBathrooms() {
        return this.numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }


}
