import java.util.Scanner;

public class Pattern4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}