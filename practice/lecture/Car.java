//CAR
// What are the physical attributes? 
// Wheels, Doors, Color, Engine, Convertible
// What actions are available?
// Drive, Start, Honk
//
public class Car{
    // MEMBER VARIABLES or ATTRIBUTES
    private int wheels;
    private int doors;
    private String color;
    private String engine;
    private boolean convertible;
    // CONSTRUCTOR METHODS
    // YOU CAN OVERLOAD THE METHODS AND CREATE AS MANY CONSTRUCTORS AS YOU WANT
    // EMPTY CONSTRUCTOR - no parameters passed by user
    public Car(){
        System.out.println("CREATING A DEFAULT CAR");
        this.wheels = 4;
        this.doors = 4;
        this.color = "Black";
        this.engine = "V4";
        this.convertible = false;
    }
    // FULL CONSTRUCTOR - all paramerters passed by user
    public Car(int wheels, int doors, String color, String engine, boolean convertible){
        System.out.println("CREATING A CUSTOM CAR");
        this.wheels = wheels;
        this.doors = doors;
        this.color = color;
        this.engine = engine;
        this.convertible = convertible;
    }
    // GETTERS / SETTERS / OTHER METHODS
    // GETTERS
    public int getWheels(){
        return this.wheels;
    }
    public int getDoors(){
        return this.doors;
    }
    //SETTERS
    public void setWheels(int newWheels){
        this.wheels = this.newWheels;
    }
}