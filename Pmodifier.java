public class Pmodifier {
    protected String fname = "rohit";
    protected String lname = "sharma";
    protected String email = "rohit.sharma1_cs19@gla.ac.in";
    protected int age = 22;
    
}
class Another extends Pmodifier{
    private int graduationYear = 2018;
    public static void main(String[] args) {
        Another myObj=new Another();
        System.out.println(myObj.fname+myObj.lname+myObj.email+myObj.age);
        System.out.println(myObj.graduationYear);
    }
}
