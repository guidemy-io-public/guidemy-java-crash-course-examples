package java_module.java_basics.flow_control;

public class Loops {
    public static void main(String[] args) {
        // While Loop - Display Numbers from 1 to 3

        int i = 1;

        while (i < 4) {
            System.out.println(i);
            i++;
        }


        // Do-While Loop - This Runs At Least Once

        boolean flag = false;
        do {
            System.out.println("This runs at least once");
        } while (flag);


        // Infinite While Loop

//        int k = 0;
//
//        while (k < 5) {
//            System.out.println("This is an infinite loop.");
//        }


        // For Loop - Display Numbers from 1 to 5

        for (int j = 1; j < 6; j++) {
            System.out.println(j);
        }


        // Another For Loop - Display Square Numbers from 1 to 100

        for (int count = 1; count <= 10; count++) {
            System.out.print(count * count);

            if (count != 10) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }


        // Infinite For Loops

//        for (int c = 0; c < 10; c--) {
//            System.out.println(c);
//        }

//        for (; ;) {
//            System.out.println("This is also an infinite for loop.");
//        }


        // For-Each Loop - Print Array Elements

        String[] topics = {"Java", "Spring", "SQL", "Linux"};

        for (String topic : topics) {
            System.out.println(topic);
        }


        // For-Each Loop - Compute the Sum of Array Elements

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("The sum is : " + sum);


        // For Loop vs For-Each Loop

        String[] names = {"Andy", "Billy", "Candy", "Ken", "Thomas"};

        for (int m = 0; m < names.length; m++) {
            System.out.println((m + 1) + ". " + names[m]);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
