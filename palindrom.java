public class palindrom{
        public static void main(String[] args) {
            int num = 121;
            int sum = 0;
            int tem = num;
            while (num > 0) {
                sum = sum * 10 + num % 10;
                num = num / 10;
            }
            if (sum == tem) {
                System.out.print(tem + " is a palindrome");
            }
        }
        }
    