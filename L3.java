import java.util.*;
public class L3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter a num :");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            int tab=num*i;
        System.out.println(num+" x "+i+" = "+ tab);
        }
        }
    }
}
