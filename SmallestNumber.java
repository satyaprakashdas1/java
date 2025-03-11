public class SmallestNumber {
    public static void main(String[] args) {
        int  a = 15, b = 10, c = 20;
        int s;

        if (a < b) {
            if (a < c) {
                s = a;
            } else {
                s = c;
            }
        } else {
            if (b < c) {
                s = b;
            } else {
                s = c;
            }
        }

        System.out.println("The smallest number is: " + s);
    }
}


