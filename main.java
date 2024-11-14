public class Main {
    public static void main(String[] args) {
        Car car = new Car("B1234XYZ", "Toyota", "Camry", 100.0, 4);
        Motorcycle motorcycle = new Motorcycle("D5678ABC", "Honda", "CBR", 50.0, false);
        Truck truck = new Truck("F9012DEF", "Mitsubishi", "Fuso", 150.0, 5.0);
        
        System.out.println("Car Information:");
        car.displayInfo();
        System.out.println("Rental Cost for 3 days: $" + car.calculateRentalCost(3));
        
        System.out.println("\nMotorcycle Information:");
        motorcycle.displayInfo();
        System.out.println("Rental Cost for 2 days: $" + motorcycle.calculateRentalCost(2));
        
        System.out.println("\nTruck Information:");
        truck.displayInfo();
        System.out.println("Rental Cost for 5 days: $" + truck.calculateRentalCost(5));
    }
}
