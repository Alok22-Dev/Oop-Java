public class Except {
    public static void main(String[] args) {
        try {
            int d = 0;
            int a = 32 / d;
            System.out.println("This is not Printed");
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("I have after try catch");
        } finally {
            System.out.println("This runs after try catch");
        }
    }
}
