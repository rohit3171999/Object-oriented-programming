public class Main32 {
    int age;
    String name;
    public Main32(int s_age, String s_name){
        age=s_age;
        name=s_name;
    }
    public static void main(String[] args) {
        Main32 myobj=new Main32(32, "rohit");
        System.out.println(myobj.age+"_"+myobj.name);
    }
}
