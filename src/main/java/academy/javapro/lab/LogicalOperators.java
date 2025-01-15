package academy.javapro.lab;

public class LogicalOperators {
    public static void main(String[] args) {
        // Predefined conditions
        boolean isRaining = true;
        boolean isSunny = !isRaining;
        boolean isWeekend = true;
        boolean hasMoney = true;
        boolean isCold = false;
        boolean hasUmbrella = true;

        // Logical AND (&&)
        System.out.println("Logical AND:");
        System.out.println("Is it raining and weekend? " + (isRaining && isWeekend));
        System.out.println("Can go to the beach (sunny and weekend and has money)? " + (isSunny && isWeekend && hasMoney));

        // Logical OR (||)
        System.out.println("\nLogical OR:");
        System.out.println("Stay home (raining or cold)? " + (isRaining || isCold));
        System.out.println("Go out (not raining or has umbrella)? " + (!isRaining || hasUmbrella));

        // Logical Not (!)
        System.out.println("\nLogical NOT:");
        System.out.println("Is it not raining? " + (!isRaining));
        System.out.println("Is it not a weekday? " + !(!isWeekend));

        // Combined Logical Operators
        System.out.println("\nCombined Logical Operators:");
        System.out.println("Complex condition ((sunny or has umbrella) and has money)? " + ((isSunny || hasUmbrella) && hasMoney));

    }
}

// Expected Output based on the predetermined conditions:
/*  Logical AND:
    Is it raining and weekend? true
    Can go to the beach (sunny and weekend and has money)? false
        // it is not sunny

    Logical OR:
    Stay home (raining or cold)? true
    Go out (not raining or has umbrella)? true

    Logical NOT:
    Is it not raining? false
    Is it not a weekday? true

    Combined Logical Operators:
    Complex condition ((sunny or has umbrella) and has money)? true
*/