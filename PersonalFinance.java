import java.util.ArrayList;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {
        // Create a list with the given items
        List<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);

        int totalExpenses = 0;
        for (int expense : expenses) {
            totalExpenses += expense;
        }

        int maxExpense = Integer.MIN_VALUE;
        for (int expense : expenses) {
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }

        int minExpense = Integer.MAX_VALUE;
        for (int expense : expenses) {
            if (expense < minExpense) {
                minExpense = expense;
            }
        }

        float averageExpense = (float) totalExpenses / expenses.size();

        // Print out the answers
        System.out.println(totalExpenses);
        System.out.println(maxExpense);
        System.out.println(minExpense);
        System.out.println(averageExpense);
    }
}
