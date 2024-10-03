package zoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  // try-with-resources para cerrar automáticamente
            System.out.println("Welcome to the Zoo!");
            System.out.print("Enter the zookeeper's name: ");
            String zooKeeperName = scanner.nextLine();

            ZooKeeper zooKeeper = new ZooKeeper(zooKeeperName);

            Animal lion = new Lion("Simba", 5);
            Animal elephant = new Elephant("Dumbo", 10);

            System.out.println("Choose an action:");
            System.out.println("1. Feed the lion");
            System.out.println("2. Feed the elephant");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    zooKeeper.feedAnimal(lion);
                    lion.makeSound();
                }
                case 2 -> {
                    zooKeeper.feedAnimal(elephant);
                    elephant.makeSound();
                }
                case 3 -> System.out.println("Exiting the zoo. Goodbye!");
                default -> System.out.println("Invalid choice.");
            }
        }  // El recurso Scanner se cierra automáticamente aquí
    }
}
