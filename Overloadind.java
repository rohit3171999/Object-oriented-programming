public class Overloadind {
    static int plusMethodInt(int x, int y){
        return x+y;
    }
    static double plusMethodInt(double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        // System.out.println("rohit sharma");
        int addint=plusMethodInt(50, 8);
        double adddouble=plusMethodInt(6.5, 8.0);
        System.out.println(addint);
        System.out.println(adddouble);
    }
}
