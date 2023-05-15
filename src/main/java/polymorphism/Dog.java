package polymorphism;

public class Dog extends Pets{
    public Dog(String petName) {
        super(petName);
    }

    @Override
    public String printspeak() {
        return "Bark Bark ";
    }

}
