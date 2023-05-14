package polymorphism;

public class Rabbit extends Pets{
    public Rabbit(String petName) {
        super(petName);
    }

    @Override
    public void printspeak() {
        System.out.println("Honk ,honk,cluck , cluck");
    }
}
