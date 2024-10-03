package zoo;

public class Giraffe extends Animal {

    public Giraffe(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " (Giraffe) hums softly!");
    }

    @Override
    public String getFood() {
        return "leaves";
    }
}
