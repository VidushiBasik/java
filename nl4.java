import java.util.*;
public class nl4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines you want to print : ");
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            for (int j=2;j<=i;j++){
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
    }
}