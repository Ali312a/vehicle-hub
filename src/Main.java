public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020, 4);
        
        myCar.describe();
        myCar.startEngine();
        myCar.honk();
        
        System.out.println("\nBefore modification:");
        System.out.println("Car make: " + myCar.getMake());
        System.out.println("Number of doors: " + myCar.getNumberOfDoors());
        
        myCar.setMake("Honda");
        myCar.setNumberOfDoors(2);
        
        System.out.println("\nAfter modification:");
        System.out.println("Car make: " + myCar.getMake());
        System.out.println("Number of doors: " + myCar.getNumberOfDoors());
        
        Bike myBike = new Bike("Giant", "Escape", 2019, "Mountain");
        
        System.out.println("\n--- Bike ---");
        myBike.describe();
        myBike.startEngine();
        myBike.ringBell();
        
        System.out.println("\nBefore modification:");
        System.out.println("Bike model: " + myBike.getModel());
        System.out.println("Bike type: " + myBike.getType());
        
        myBike.setModel("Defy");
        myBike.setType("Road");
        
        System.out.println("\nAfter modification:");
        System.out.println("Bike model: " + myBike.getModel());
        System.out.println("Bike type: " + myBike.getType());
    }
}