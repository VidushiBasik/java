public class nl3 {
    public static void main(String[] args){
        int n = 4;
        char ch ='A';
        for(char i=1;i<=n;i++){
            for(char j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}