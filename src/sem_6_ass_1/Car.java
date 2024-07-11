package sem_6_ass_1;
/*Define a class `Car` with fields for `make`, `model`, and `year`. 
 * Include a constructor toinitialize these fields. 
 * Write a main method to create an instance of `Car` and print itsdetails.
 * */
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2021);
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}
