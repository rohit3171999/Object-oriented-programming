
// Sort an Array without using function ===> bubble sort

import java.util.Scanner;
public class Rohit7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter ayyar elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        //int index=-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                int temp=0;
                if (array[i]>array[j]) {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ,");
        }
        }

}
