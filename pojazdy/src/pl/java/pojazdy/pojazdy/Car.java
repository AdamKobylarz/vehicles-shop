package pl.java.pojazdy.pojazdy;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Car {

    private ArrayList<String> usersListOfCars = new ArrayList<>();

    Scanner choiceOfCar = new Scanner(System.in);

    public void  displayListOfCars () {
        System.out.println("Ford "+ "Audi "+ "Toyota "+ "Skoda "+ "BMW "+ "Opel ");

        String userChoiceOfCar = choiceOfCar.nextLine();

        System.out.println("Excellent choice, selected: " + userChoiceOfCar);
        usersListOfCars.add(userChoiceOfCar);
    }

    public void displaySelectedCar () {
            for (String SelectedCars : usersListOfCars) {
                System.out.println(SelectedCars);
            }
    }
}



