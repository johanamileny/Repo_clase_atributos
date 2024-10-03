package zoo;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Métodos abstractos para ser implementados por las subclases
    public abstract void makeSound();

    // Método abstracto para obtener el tipo de comida del animal
    public abstract String getFood();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal: " + name + ", Age: " + age;
    }
}
