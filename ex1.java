import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int num = sc.nextInt();
        if ( num<0) {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is positive");
        }
    }
}