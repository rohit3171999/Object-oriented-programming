class Vehicle{
    protected String brand="ford";
    public void horn(){
        System.out.println("xyz");
    }
}
class Car extends Vehicle {
    private String modelname="endavour";
    public static void main(String[] args) {
        Car mycar=new Car();
        mycar.horn();
        System.out.println(mycar.brand+"  "+mycar.modelname);
    }
    
}
