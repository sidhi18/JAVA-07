import java.util.Scanner;

public class Day_07_revision {
    public static void main(String[] args) {
        // programm to calculate simple interest
        double p = 2000;
        double  i = 6;
        double t = 3;
        double si = (p*i*t)/100;
        System.out.println("SIMPLE INTEREST IS : ");
        System.out.println("Principal amount : $"+p);
        System.out.println("Interest rate : "+i);
        System.out.println("Years : "+t);
        System.out.println("SimpleInterest : $"+si);

        // BY TAKING INPUT FROM USER
        Scanner simple = new Scanner(System.in);
        System.out.print("ENTER PRINCIPAL AMOUNT : $");
        double d = simple.nextDouble();
        System.out.print("ENTER INTEREST RATE : " );
        double d2 = simple.nextDouble();
        System.out.print("ENTER YEARS : ");
        double d3 = simple.nextDouble();
        double d5 = (d*d2*d3)/100;
        System.out.println("SIMPLE INTEREST IS : $"+d5);

    }
}
