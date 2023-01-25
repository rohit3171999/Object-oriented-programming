import java.util.Arrays;
import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Rohit6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int arr_size=sc.nextInt();
        int[] arr=new int[arr_size];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("largest number in array is "+max);

    }
}
