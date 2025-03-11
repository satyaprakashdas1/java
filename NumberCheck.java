public class NumberCheck {
    public static void main(String[] args) {
        int num = 20;
        if (num > 0) {
            System.out.println(num + " positive number.");
        } else if (num < 0) {
            System.out.println(num + "  negative number.");
        } else {
            System.out.println("zero");
        }
        if (num % 2 == 0) {
            System.out.println(num + "  even number.");
        } else {
            System.out.println(num + " odd number.");
        }
    }
}
