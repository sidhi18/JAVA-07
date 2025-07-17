import java.util.Scanner;
// program to check divisibily of a number
public class Divisibility {
    public static void main(String[] args) {
        Scanner divisible = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = divisible.nextInt();
        if (a%5== 0 ){
            System.out.println("Number is divisible by 5 ");
        } else if (a%11 == 0){
            System.out.println("Number is divisible by 11");
        } else {
            System.out.println("Number is not divisible either by 5 or 11");
        }
    }
}
