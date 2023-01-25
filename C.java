public class C {
    public static void main(String[] args) {
        int num=12345, rev=0;
        System.out.println("the original number is "+num);
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("reverse number is "+rev);
                
    }
    
}
