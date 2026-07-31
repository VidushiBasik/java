import java.util.*;
public class shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float gst = total * 0.18f;
        float finalAmount = total + gst;    
        System.out.println("The final amount is " + finalAmount);
    }
}
