public class Truck extends Vehicle {
    private double loadCapacity;
    
    public Truck(String licensePlate, String brand, String model, double rentalPricePerDay, double loadCapacity) {
        super(licensePlate, brand, model, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
