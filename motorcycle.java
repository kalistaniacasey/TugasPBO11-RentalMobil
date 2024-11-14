public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String licensePlate, String brand, String model, double rentalPricePerDay, boolean hasSidecar) {
        super(licensePlate, brand, model, rentalPricePerDay);
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
