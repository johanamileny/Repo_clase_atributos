package zoo;

public class Elephant extends Animal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets!");
    }

    @Override
    public String getFood() {
        return "Plants and fruits";
    }
}
