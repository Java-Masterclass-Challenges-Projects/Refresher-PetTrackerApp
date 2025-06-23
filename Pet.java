public class Pet {

    // Fields (Encapsulation)
    private String name;
    private double weight;

    // Constructor
    public Pet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    // String representation for printing
    @Override
    public String toString() {
        return name + " weighs " + weight + " lbs";
    }

    // Optional: Equality check based on name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Pet otherPet = (Pet) obj;
        return this.name.equalsIgnoreCase(otherPet.name);
    }
}
