package pl.java.pojazdy.pojazdy;

import pl.java.pojazdy.pojazdy.Car;

import java.net.CacheRequest;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerUserChoice = new Scanner(System.in);
        Vehicles vechicles = new Vehicles();
        ShoppingCart shoppingCart = new ShoppingCart();
        Car car = new Car();

        System.out.println();
        System.out.println("Hi, welcome in our shop. Chose options presented below: ");
        System.out.println();

        boolean loop = true;
        while (loop) {
            System.out.println("1. Types of vechicles ");
            System.out.println("2. Details about vechicle ");
            System.out.println("3. Test run of vechicle ");
            System.out.println("4. Your shopping cart");
            System.out.println("5. Exit ");

            int userChoice = scannerUserChoice.nextInt();

            switch (userChoice){
                case 1 -> vechicles.displayOptionAboutVehicle();
                case 2 -> System.out.println("wybrano 2");
                case 3 -> System.out.println("Wybrano 3");
                case 4 -> shoppingCart.displayShoppingCart();
                case 5 -> loop = false;
            }
        }
    }
}