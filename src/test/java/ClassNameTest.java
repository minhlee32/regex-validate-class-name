public class ClassNameTest {
    private static String[] validName = new String[]{"C0618G1", "C0323H1", "C0724L8"};
    private static String[] invalidName = new String[]{"K06l8G01", "C071G1", "C0618GA", "c0618g01", "C08G1","C0618A11"};
    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String name : validName) {
            className.validate(name);
            System.out.println("Class name " + name + " is valid");
        }
        for (String name : invalidName) {
            className.validate(name);
            System.out.println("Class name " + name + " is invalid");
        }
    }
}