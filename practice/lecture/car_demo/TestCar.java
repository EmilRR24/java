public class TestCar{
    public static void main(String[] args){
        // INSTANTIATE THE CAR
        Car defaultCar = new Car();
        
        Car armenCar = new Car(4, 4, "White", "V8", true);
        System.out.println(armenCar.getWheels());
    }
}