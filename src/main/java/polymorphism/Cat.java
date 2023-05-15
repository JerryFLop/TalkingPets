package polymorphism;

public class Cat extends Pets{
    public Cat(String petName) {
        super(petName);
    }

    @Override
    public String printspeak() {
        return "Meow Meow";
    }
}

