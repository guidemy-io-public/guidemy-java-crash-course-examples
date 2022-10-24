package java_module.java_basics.flow_control;

public class Conditionals {
    public static void main(String[] args) {
        // If-else statement

        int number = 0;

        // Checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // Checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        }

        // If both conditions are false
        else {
            System.out.println("The number is zero.");
        }


        // Switch statement

        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }


        // Switch statement without breaks

        int expression = 2;

        switch (expression) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default case");
        }


        // Switch statement with default

        String courseType = "One-Off";

        switch (courseType) {
            case "Full-Time":
                System.out.println("You've taken a full-time course.");
                break;
            case "Part-Time":
                System.out.println("You've taken a part-time course");
                break;
            default:
                System.out.println("You've taken neither a full-time nor a part-time course.");
        }
    }
}
