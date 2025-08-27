// Create a class Car with instance variables model and year. Create two car objects and display their details.

class Car{
    String model;
    int year;

    static int numberOfCars = 0;

    Car(String model, int year){
        this.model = model;
        this.year = year;

        numberOfCars++;

    }

    void displayDetails(){
        System.out.println("Car Model: "+model+", Year: "+year);
    }
}
public class CarObject{
    public static void main(String[] args) {
        Car car1 = new Car("Fortuner",1990);
        Car car2 = new Car("Defender",1985);

        car1.displayDetails();
        car2.displayDetails();
        System.out.println("Total number of cars are "+Car.numberOfCars);
    }
}