import java.util.*;
public class loop4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = 1;
        int sum = 0;
        while(n<=i){
            sum += n;
            n++;
        }
        System.out.print("Sum :"+ sum);
    }
}
