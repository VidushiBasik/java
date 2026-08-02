import java.util.*;
public class ex4 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
        int year = sc.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("The year is a leap year");
                }
                else{
                    System.out.println("The year is not a leap year");
                }
            }else{
                System.out.println("The year is a leap year");
            }
        }else{
            System.out.println("The year is not a leap year");
        }
        }
    }       
}