import java.util.*;
public class SolidArray{
    Scanner sc=new Scanner(System.in);
    //System.out.println("enter the row size");
    int row=sc.nextInt();
    Scanner in=new Scanner(System.in);
    //System.out.println("enter the coloumn size");
    int col=in.nextInt();
    public static void main(String[] args) {
        for (int i = 1; i <=row; i++) {
            for(int j=1; j<=col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}