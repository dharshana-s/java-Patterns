import java.util.Scanner;

public class Pattern7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int row = 1; row <=n; row++){
            for(int noOfSpaces=1;noOfSpaces<=n-row;noOfSpaces++){
                System.out.print("  ");
            }for(int col=1;col<=row;col++){
                System.out.print("  * ");
            }System.out.println();
        }
    }
}