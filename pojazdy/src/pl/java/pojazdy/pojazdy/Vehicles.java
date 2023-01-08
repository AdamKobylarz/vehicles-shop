package pl.java.pojazdy.pojazdy;

import pl.java.pojazdy.pojazdy.Car;

import java.util.Scanner;

public class Vehicles {
    public Vehicles () {
    }

    Scanner typeOfVechicle = new Scanner(System.in);

    private boolean loopVehicles = true;
    Car car = new Car();

    public void displayOptionAboutVehicle() {
        while (loopVehicles) {
            System.out.println("Chose type of vechicle you want to buy:");
            System.out.println("1. Car");
            System.out.println("2. Motorbike");
            System.out.println("3. Bike");
            System.out.println("4. Exit");

            int userChoiceTypeOfVechicle = typeOfVechicle.nextInt();

            switch (userChoiceTypeOfVechicle) {
                case 1 -> car.displayListOfCars();
                case 2 -> System.out.println("wybrano 2");
                case 3 -> System.out.println("wybrano 3");
                case 4 -> loopVehicles = false;
           }
        }
    }
}
