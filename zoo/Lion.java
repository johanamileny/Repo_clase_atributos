package zoo;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars!");
    }

    @Override
    public String getFood() {
        return "Meat";
    }
}
