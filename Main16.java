public class Main16 {
    int modelyear;
    String modelname;
    public Main16(int year, String name){
        modelyear=year;
        modelname=name;

    }
    public static void main(String[] args) {
        Main16 myObj=new Main16(2022, "MG");
        System.out.println(myObj.modelyear +" "+myObj.modelname);
    }
}
// We can have as many parameters as we want: