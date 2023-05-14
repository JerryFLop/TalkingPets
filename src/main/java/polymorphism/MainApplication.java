package polymorphism;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Pets pet1 = new Cat("batman");
        Pets pet2 = new Dog("raven");
        Pets pet3 = new Rabbit("midnight");

        Scanner pets = new Scanner(System.in);

        System.out.println("how many pets do you have : ");
        int numberOfPets = pets.nextInt();

        System.out.println("what kind of pet :");
        String typesOfPets = pets.next();

        System.out.println("Your pets name : ");
        String petsName = pets.next();

        System.out.println( "amount of pets :" + numberOfPets +'\n' + "Kind of pets :" + typesOfPets + '\n' + "Pets Name :" + petsName );

    }

}
