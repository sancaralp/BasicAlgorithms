import java.util.Scanner;
public class sum_of_digits {
    public static int sum(int a) {
        int b=0;
        int n=String.format("%d", a).length(); //n is equal to number of digits you have
        while(n>=0) {
            b+=a/Math.pow(10, n);
            a%=Math.pow(10, n);
            n--;
        }


        return b;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = scan.nextInt();
        System.out.print("The sum of the digits of your number is: "+sum(num));

    }

}