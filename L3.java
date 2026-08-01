import java.util.*;
public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            int num = sc.nextInt();
            int tab=num*i;
        }
        System.out.println(num+" x "+i+" = "+ tab);
    }
}
