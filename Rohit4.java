import java.security.Principal;
import java.util.Scanner;

public class Rohit4 {
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("enter array sixe");
        int arrsize=myobj.nextInt();
        int[] arr=new int[arrsize];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=myobj.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
