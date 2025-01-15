package academy.javapro.lab;

public class LogicalOperators {
    public static void main(String[] args) {
        // Predefined conditions
        boolean isRaining = false;
        boolean isSunny = !isRaining;
        boolean isWeekend = true;
        boolean hasMoney = true;
        boolean isCold = false;
        boolean hasUmbrella = true;

        // Logical AND (&&)
        System.out.println("Logical AND:");

        // Logical OR (||)
        System.out.println("Logical OR:");

        // Logical Not (!)
        System.out.println("Logical NOT:");

        // Combined Logical Operators
        System.out.println("Combined Logical Operators:");

    }
}

// Expected Output:
/*  Logical AND:
    Is it raining and weekend? false
    Can go to the beach (sunny and weekend and has money)? true

    Logical OR:
    Stay home (raining or cold)? true
    Go out (not raining or has umbrella)? true

    Logical NOT:
    Is it not raining? false
    Is it not a weekday? true

    Combined Logical Operators:
    Complex condition ((sunny or has umbrella) and has money)? true
*/