// Single and Multilevel Inheritance Example with Fishes

// Base class (Parent)
class Fish {
    void swim() {
        System.out.println("Fish swims in water");
    }
}

// Single Inheritance: Goldfish inherits from Fish
class Goldfish extends Fish {
    void shine() {
        System.out.println("Goldfish shines brightly");
    }
}

// Multilevel Inheritance: BabyGoldfish inherits from Goldfish
class BabyGoldfish extends Goldfish {
    void small() {
        System.out.println("Baby Goldfish is very small");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Single inheritance demonstration
        Goldfish g = new Goldfish();
        g.swim();   // From Fish
        g.shine();  // From Goldfish

        System.out.println();

        // Multilevel inheritance demonstration
        BabyGoldfish b = new BabyGoldfish();
        b.swim();   // From Fish
        b.shine();  // From Goldfish
        b.small();  // From BabyGoldfish
    }
}
