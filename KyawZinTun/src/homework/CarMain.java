package homework;
import java.util.Scanner;
//myownautoshop
public class CarMain {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        // Car class input
        System.out.println("Enter Car details (Speed, Price, Color): ");
        int carspeed = a.nextInt();
        double carPrice = a.nextDouble();
        a.nextLine(); // Consume the newline character left by nextDouble()
        String carColor = a.nextLine();
        Car car = new Car(carspeed, carPrice, carColor);

        // Truck class input
        System.out.println("Enter Truck details (Speed, Price, Color, Weight): ");
        int truckSpeed = a.nextInt();
        double truckPrice = a.nextDouble();
        a.nextLine();  // Consume the newline character after nextDouble()
        String truckColor = a.nextLine();
        int truckWeight = a.nextInt();
        Truck truck = new Truck(truckSpeed, truckPrice, truckColor, truckWeight);

        // Ford class input
        System.out.println("Enter Ford details (Speed, Price, Color, Year, Discount): ");
        int fordSpeed = a.nextInt();
        double fordPrice = a.nextDouble();
        a.nextLine();  // Consume the newline character after nextDouble()
        String fordColor = a.nextLine();
        int fordYear = a.nextInt();
        int fordDiscount = a.nextInt();
        Ford ford = new Ford(fordSpeed, fordPrice, fordColor, fordYear, fordDiscount);

        // Sedan class input
        System.out.println("Enter Sedan details (Speed, Price, Color, Length): ");
        int sedanSpeed = a.nextInt();
        double sedanPrice = a.nextDouble();
        a.nextLine();  // Consume the newline character after nextDouble()
        String sedanColor = a.nextLine();
        int sedanLength = a.nextInt();
        Sedan sedan = new Sedan(sedanSpeed, sedanPrice, sedanColor, sedanLength);

        // Final output
        System.out.println("\n--- Sale Prices ---");
        System.out.println("Car Sale Price: $" + car.getSalePrice());
        System.out.println("Truck Sale Price: $" + truck.getSalePrice());
        System.out.println("Ford Sale Price: $" + ford.getSalePrice());
        System.out.println("Sedan Sale Price: $" + sedan.getSalePrice());

        a.close(); // Close the scanner object
    }
}

// Superclass Car
        class Car {
        int speed;
        double regularPrice;
        String color;

 // Constructor
        public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

// Method
        public double getSalePrice() {
        return regularPrice;
    }
}

// Truck (child class)
        class Truck extends Car {
        int weight;

 // Constructor
        public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

 // Method
        public double getSalePrice() {
        if (weight > 2000)
        return regularPrice * 0.9;
        else {
        return regularPrice * 0.8;
        }
    }
}

// Ford class (child class of Car)
        class Ford extends Car {
        int year;
        int manufacturerDiscount;
 // Constructor
        public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

 // Method
        public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}

// Sedan class (child class of Car)
        class Sedan extends Car {
        int length;
// Constructor
        public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

// Method
        public double getSalePrice() {
        if (length > 20) {
        return regularPrice * 0.95;  // 5% discount
        } else {
        return regularPrice * 0.90;  // 10% discount
        }
    }
}
