import java.util.Scanner;

public class Pattern5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for(int i =1; i<=n;i++){
            if(i<n){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
            }System.out.println();
            }
            else{
                for(int k=1;k<=n;k++){
                    for(int l = n;l>=k;l--){
                        System.out.print("* ");
                    }System.out.println();
                } 
            }
            
        }
    }
}