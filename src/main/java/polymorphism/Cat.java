package polymorphism;

public class Cat extends Pets{
    public Cat(String petName) {
        super(petName);
    }

    @Override
    public void printspeak() {
        System.out.println("Meow Meow");
    }
}

