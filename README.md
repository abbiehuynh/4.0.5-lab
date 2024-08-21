# Lab 4.0.5

**Learning Objectives**

- Understand the concept and importance of logical operators in Java development.
- Learn how to implement logical operators (AND, OR, NOT) in Java programs.
- Explore practical applications of logical operators in real-world Java projects.
- Identify common pitfalls and best practices when working with logical operators.
- Gain hands-on experience with a complete Java example that demonstrates logical operators.

**Prerequisites**
- 
- Basic understanding of Java programming.
- Familiarity with boolean values and relational operators.
- Knowledge of how to run a Java program.

**What You'll Achieve**
- Develop a solid understanding of logical operators (AND, OR, NOT) in Java.
- Implement practical examples of logical operators that can be applied in real-world scenarios.
- Enhance your skills in boolean logic and decision-making in programming.

**Assignment Details**
1. Create boolean variables to represent various conditions (e.g., isRaining, isWeekend, hasMoney).
2. Use the AND operator (&&) to check if two or more conditions are true simultaneously.
3. Use the OR operator (||) to check if at least one of two or more conditions is true.
4. Use the NOT operator (!) to negate a boolean condition.
5. Combine different logical operators to create more complex conditions.
6. Print the results of each logical operation with a descriptive message.

**Example Output**
```
Logical AND:
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
```

**Starter Code**
```java
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

        // TODO: Implement logical operations here
    }
}
```

**Hints**
- Remember that && (AND) returns true only if all conditions are true.
- The || (OR) operator returns true if at least one condition is true.
- The ! (NOT) operator inverts the boolean value it precedes.
- You can combine multiple logical operators in a single expression.
- Use parentheses to group conditions and control the order of evaluation in complex expressions.

**Submission Instructions**
1. Fork the repository
2. Clone your fork
3. Navigate into the repository
4. Implement the required logical operations in the main method
5. Test your implementation with various combinations of the predefined conditions
6. Git add, commit, and push to your fork
7. Submit a pull request
    - Add a title clearly describing your changes
    - In the comment, briefly explain your implementation approach and any challenges you faced

Remember, the goal is to learn and have fun! Don't hesitate to ask for help if you get stuck.