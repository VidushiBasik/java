import java.util.*;
public class loop3 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
        int range = sc.nextInt();
        int num = 1;
        while(num<=range){
            System.out.print(num+" ");
            num++;
        }
        }
    }
}
