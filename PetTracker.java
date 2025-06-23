import java.util.ArrayList;
import java.util.Scanner;

public class PetTracker {

    private ArrayList<Pet> pets = new ArrayList<>();

    public boolean addPet(Pet pet) {
        if (pets.contains(pet)) {
            return false; // Don't add duplicates
        }
        pets.add(pet);
        return true;
    }

    public boolean removePet(Pet pet) {
        return pets.remove(pet);
    }

    public void listPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets currently tracked");
            return;
        }

        System.out.println("Tracked pets:");
        for (Pet pet : pets) {
            System.out.println("- " + pet.getName());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetTracker tracker = new PetTracker();

        boolean quit = false;

        while (!quit) {
            System.out.println("\nAvailable actions:");
            System.out.println("0 - Quit");
            System.out.println("1 - Add a new pet");
            System.out.println("2 - Remove a pet");
            System.out.println("3 - List all pets");
            System.out.println("4 - Show the lightest pet");
            System.out.print("Enter choice: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "0" -> quit = true;

                case "1" -> {
                    System.out.print("Enter pet name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Enter pet weight: ");
                    double weight = Double.parseDouble(scanner.nextLine().trim());

                    Pet newPet = new Pet(name, weight);
                    if (tracker.addPet(newPet)) {
                        System.out.println(name + " has been added.");
                    } else {
                        System.out.println("That pet already exists.");
                    }
                }

                case "2" -> {
                    System.out.print("Enter pet name to remove: ");
                    String name = scanner.nextLine().trim();

                    Pet petToRemove = new Pet(name, 0); // Weight doesn't matter for removal
                    if (tracker.removePet(petToRemove)) {
                        System.out.println(name + " removed.");
                    } else {
                        System.out.println("Pet not found.");
                    }
                }

                case "3" -> tracker.listPets();

                case "4" -> {
                    Pet lightest = tracker.getLightestPet();
                    if (lightest != null) {
                        System.out.println("Lightest pet: " + lightest);
                    } else {
                        System.out.println("No pets to compare.");
                    }
                }

                default -> System.out.println("Invalid input. Please try again.");
            }
        }

        System.out.println("Exiting tracker.");
    }

    public Pet getLightestPet() {
        if (pets.isEmpty()) {
            return null;
        }

        Pet lightest = pets.get(0); // Start with the first pet
        for (Pet pet : pets) {
            if (pet.getWeight() < lightest.getWeight()) {
                lightest = pet;
            }
        }

        return lightest;
    }
}

