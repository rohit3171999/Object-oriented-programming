public class GFG2 {
    public static int count(String s, char c){
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="rohit sharma";
        char c='a';
        System.out.println(count(str, c));
    }
}
