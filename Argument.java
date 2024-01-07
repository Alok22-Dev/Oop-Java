public class Argument {
    public static void main(String[] args) {
        System.out.println("Number of command line argument=" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(String.format("command line argument % is $s", i, args[i]));
        }
    }
}
