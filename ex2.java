import java.util.*;
public class ex2{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num<100){
            System.out.println("you dont have fever");
        }
        else{
            System.out.println("you have fever");
        }
    }
}