import java.util.ArrayList;
import java.util.Collection;
public class Rohit8 {
    public static void main(String[] args) {
        ArrayList<String> car=new ArrayList<String>();
        car.add("maruti");
        car.add("hyundai");
        car.add("merecrdeas");
        car.add("volvo");
        //System.out.println(car.set(2, "bmw")); ==>change an item
        //System.out.println(car.get(1)); //====> access an item
        //System.out.println(car.remove(0));===>remove an item====>car.clear() <====remove all
        //System.out.println(car.size());
        //Collection.sort(car);
        // for (int i = 0; i < car.size(); i++) {
        //     System.out.print(car.get(i)+" ");
        // }
        for (String i : car) {
            System.out.println(i);
        }
    }
}
