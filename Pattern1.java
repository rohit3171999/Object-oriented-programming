//print solid rectangel star pattern
        // *****
        // *****
        // *****
        // *****
        // row==i==4
        // col==j==5
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size");
        int row=sc.nextInt();
        System.out.println("enter the coloumn size");
        int col=sc.nextInt();
        for (int i = 1; i <=row; i++) {
            for(int j=1; j<=col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
