import java.util.Scanner;
public class equationSolver {
    public static void main(String[] args){
        double root1;
        double root2;

        do {
            System.out.println("Please enter a, b, c with spaces after each. (For an equation like ax^2+bx+c)");
            Scanner read = new Scanner(System.in);
            double a = read.nextDouble();
            double b = read.nextDouble();
            double c = read.nextDouble();

            double discriminant = Math.pow(b, 2) - 4 * a * c;


            if (discriminant < 0) {
                System.out.println("Your equation has no real roots.");
                System.exit(0);
            } else if (discriminant == 0) {
                root1 = (-b) / (2 * a);
                System.out.println("Your equation has two equal roots,\nYour root is: " + root1);
            } else {
                root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Your equation has two different real roots\nYour first root is: " + root1 + "\nYour second root is: " + root2);
            }
            System.out.println("Do you want to continue?\n1-Continue\n2-Exit");
            if(read.nextByte()==2)System.exit(0);

        }
        while(true);
    }
}
