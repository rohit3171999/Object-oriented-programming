class Animal{
    public void sound(){
        System.out.println("xyz");
    }

}
class Dog extends Animal{
    public void sound(){
        System.out.println("dog==xyz");
    }
}
class Pig extends Animal{
    public void sound(){
        System.out.println("pig==xyz");
    }
}
public class Main111 {
    public static void main(String[] args) {
        Animal myanimal=new Animal();
        Animal mydog=new Dog();
        Animal mypig=new Pig();
        myanimal.sound();
        mydog.sound();
        mypig.sound();

    }
    
}
