import java.util.Scanner;

public class Pattern5_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row=1;row<2*n;row++){
            int totalColsInRow = row>n ?2*n-row :row;
            for(int col=1;col<=totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}