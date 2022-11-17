public class Recursion {
    // Use recursion to add all of the numbers up to 10.
    public static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int result=sum(1000);
        System.out.println(result);
    }
}
