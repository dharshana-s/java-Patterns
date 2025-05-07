import java.util.Scanner;
public class Pattern3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int i=1; i<=n;i++){
            for(int j=n; j>=i;j--){
            System.out.print("* ");
        }System.out.println();
        }
    }
}