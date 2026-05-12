import java.util.ArrayList;
import java.util.Scanner;

public class CarDriver {

    // method to print all cars
    public static void printCars(ArrayList<Car> cars) {

        for (Car car : cars) {
            System.out.println(car);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // create a Scanner for input
        Scanner input = new Scanner(System.in);

        // create an ArrayList of Car objects called "cars"
        ArrayList<Car> cars = new ArrayList<>();

        // create variables
        double mpg;
        double fuel;
        String name;

        String answer = "y";

        /*
         * use a loop to gather the information to create a Car object
         * and store it in cars
         */
        while (answer.equalsIgnoreCase("y") ||
               answer.equalsIgnoreCase("yes")) {

            // get user input
            System.out.print("Enter car name: ");
            name = input.nextLine();

            System.out.print("Enter MPG: ");
            mpg = input.nextDouble();

            System.out.print("Enter fuel amount: ");
            fuel = input.nextDouble();

            input.nextLine(); // clear buffer

            // create Car object and add to list
            Car car = new Car(mpg, fuel, name);
            cars.add(car);

            // ask to continue
            System.out.print("Would you like to enter another car? ");
            answer = input.nextLine();
        }

        // print the list
        System.out.println("\n--- Car List ---");
        printCars(cars);

        // access one element and move it
        if (!cars.isEmpty()) {
            System.out.println("\nDriving first car...\n");
            cars.get(0).drive(5);
        }

        // print the list again
        System.out.println("\n--- Updated Car List ---");
        printCars(cars);

        input.close();
    }
}