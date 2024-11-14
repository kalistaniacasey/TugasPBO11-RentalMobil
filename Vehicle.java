public class Vehicle {
    protected String licensePlate;
    protected String brand;
    protected String model;
    protected double rentalPricePerDay;
    
    public Vehicle(String licensePlate, String brand, String model, double rentalPricePerDay) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    
    public void displayInfo() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Price per Day: $" + rentalPricePerDay);
    }
    
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }
}
