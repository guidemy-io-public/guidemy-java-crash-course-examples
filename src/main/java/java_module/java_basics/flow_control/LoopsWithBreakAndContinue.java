package java_module.java_basics.flow_control;

public class LoopsWithBreakAndContinue {
    public static void main(String[] args) {
        // break Example 1 - Lucky Number Seven

        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                System.out.println("Lucky number 7");
                break;
            }
            System.out.println(i);
        }

        // break Example 2 - Skip the multiples of 7 (with break)

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                if (i == 7) {
                    System.out.print("--- Skip the multiples of 7 ---");
                    break;
                }

                System.out.print(i * j);

                if (j != 10) {
                    System.out.print(", ");
                }
            }

            System.out.println();
        }

        // continue Example 1 - Skip the Multiples of 3

        int[] numbers = {1, 3, 5, 7, 9, 11};

        for (int number : numbers) {
            if (number % 3 == 0) {
                continue;
            }
            System.out.println("I like the number of " + number + "!");
        }

        // continue Example 2 - Skip the multiples of 7 (with continue)

        for (int i = 1; i <= 10; i++) {

            if (i == 7) {
                System.out.println("--- Skip the multiples of 7 ---");
                continue;
            }

            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);

                if (j != 10) {
                    System.out.print(", ");
                }
            }

            System.out.println();
        }
    }
}
