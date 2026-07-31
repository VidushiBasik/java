public class loop6 {
    public static void main(String[] args){
        int i = 161105;
        while(i>0){
            int n = i%10;
            System.out.print(n + " ");
            i/=10;
        }
        System.out.println();
    }
}
