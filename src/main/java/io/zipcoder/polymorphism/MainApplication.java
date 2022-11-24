package io.zipcoder.polymorphism;

import java.util.*;

public class MainApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numOfPets = 0;
        String petName = "";
        String petType = "";
        boolean wrongInput = false;
        ArrayList<String> petList = new ArrayList<>();

        System.out.println("How many pets do you have?");
        numOfPets = in.nextInt();

        // Check if the user enters a negative number or zero
        while (numOfPets < 0) {
            System.out.println("Number of pets can not be " + numOfPets + ". Please enter how many pets do you have?");
            numOfPets = in.nextInt();
        }

        for (int i = 0; i < numOfPets; i++) {

            System.out.println("What kind of pet is for Pet #" + (i + 1) + "?");
            petType = in.next();
            System.out.println("What's the name for Pet #" + (i + 1) + "?");
            petName = in.next();

            switch (petType) {
                case "dog":
                    System.out.println("The type is pet is dog." + " It's name is " + petName);
                    petList.add(petName);
                    break;
                case "cat":
                    System.out.println("The type is pet is cat." + " It's name is " + petName);
                    petList.add(petName);
                    break;
                case "bird":
                    System.out.println("The type is pet is bird." + " It's name is " + petName);
                    petList.add(petName);
                    break;
                default:
                    System.out.println("You entered the wrong pet type. Please re-enter.");
                    i--;
                    break;
            }


        }
        System.out.println("These are your pets: ");
        for(int i=0; i<petList.size(); i++){
            System.out.println(petList.get(i));
        }

    }
}