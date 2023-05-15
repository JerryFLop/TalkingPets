package polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Pets pet1 = new Cat("batman");
        Pets pet2 = new Dog("raven");
        Pets pet3 = new Rabbit("midnight");

        Scanner pets = new Scanner(System.in);
        List<Pets>listOfPets = new ArrayList<>();
        System.out.println("how many pets do you have : ");

        int numberOfPets = pets.nextInt();
     for(int i = 0; i < numberOfPets; i++) {
    System.out.println("what kind of pet :" + (i  + 1));
    String typesOfPets = pets.next();

    System.out.println("Your pets name : ");
    String petsName = pets.next();

    if(typesOfPets.equalsIgnoreCase("dog")){
        listOfPets.add(new Dog(petsName));
    }else if(typesOfPets.equalsIgnoreCase("cat")){
        listOfPets.add(new Cat(petsName));
    }else if (typesOfPets.equalsIgnoreCase("rabbit")){
        listOfPets.add(new Rabbit(petsName));}
    else{
        System.out.println("Sorry we don't accept that type of animal");}
     }
        for(Pets pet : listOfPets){
            System.out.println( pet.getName() + " says " + pet.printspeak());
        }
    }

}
