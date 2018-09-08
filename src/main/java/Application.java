import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        ClassName className = new ClassName();
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a class name");
        name = scanner.next();
        if (className.validate(name)) {
            System.out.println("Class name " + name + " is valid");
        }else
            System.out.println("Class name " + name + " is invalid");
    }
}



