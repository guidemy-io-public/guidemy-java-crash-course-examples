package java_module.java_basics.intro_to_java;

public class HelloWorldWithArgs {
    public static void main(String[] args) {
        String name;

        if (args.length == 0) {
            name = "World";
        } else {
            name = args[0];
        }

        System.out.printf("Hello %s!\n", name);
        System.out.println("Welcome to Guidemy!");
        System.out.print("This is your first Java Program!\n");
    }
}
