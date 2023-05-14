package polymorphism;

public abstract class Pets {

    private String name;

    public Pets(String petName){
        this.name = petName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printspeak();


}
