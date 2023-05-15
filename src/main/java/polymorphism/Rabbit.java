package polymorphism;

public class Rabbit extends Pets{
    public Rabbit(String petName) {
        super(petName);
    }

    @Override
    public String printspeak() {

        return "Honk ,honk,cluck , cluck";
    }
}
