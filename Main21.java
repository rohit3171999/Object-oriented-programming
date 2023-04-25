import java.util.*;
public class Main21{
    public static void main(String[] args) {
        int num;
        Scanner myobj=new Scanner(System.in);
        System.out.println("enter the elements u wnat to store");
        num=myobj.nextInt();
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=myobj.nextInt();
            System.out.println(arr[i]);
        }


    }

}