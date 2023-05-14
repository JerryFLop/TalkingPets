package polymorphism;

public class Dog extends Pets{
    public Dog(String petName) {
        super(petName);
    }

    @Override
    public void printspeak() {
        System.out.println("Bark Bark ");
    }

}
