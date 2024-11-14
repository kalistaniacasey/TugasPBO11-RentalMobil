public class Car extends Vehicle {
    private int numberOfDoors;
    
    public Car(String licensePlate, String brand, String model, double rentalPricePerDay, int numberOfDoors) {
        super(licensePlate, brand, model, rentalPricePerDay);
        this.numberOfDoors = numberOfDoors;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
