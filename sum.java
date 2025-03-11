public class sum{
    public static void main(String[] args) {
        int num=156;
        int sum=0;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        System.err.print(sum);

    }
}