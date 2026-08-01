import java.util.*;
public class L1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int even=0;
        int odd=0;
        do { 
            System.out.println("Enter a num: ");
            num = sc.nextInt();
            if (num%2==0){
                even+=num;
            }else{
                odd+=num;
            }
            System.out.println("Enter 1 if you want to continue");
            choice = sc.nextInt();
        } while (choice==1);
            System.out.println("Even sum is "+even);
            System.out.println("Odd sum is "+odd);
    }
}