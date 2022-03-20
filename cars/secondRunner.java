import java.util.ArrayList;

public class secondRunner {
    private ArrayList<Car> cars = new ArrayList<Car>();
    public void assign(){

        Car c1 = new Car("benz", "glc", "52500", "Jack");
        Car c2 = new Car("benz", "sedan", "111100", "Arta");
        Car c3 = new Car("benz", "wagon", "68400", "Martin");

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
    }
    public void display(){
        System.out.println("Here is cars information: ");
        for(Car c : cars){
            System.out.println("car Model: " + c.carModel);
            System.out.println("car Name: " + c.carName);
            System.out.println("car Price: " + c.carPrice);
            System.out.println("car Owner: " + c.carOwner);
            System.out.println("--------------------------");
        }
    }
    public static void main(String[] args){
        secondRunner myObj = new secondRunner();
        myObj.assign();
        myObj.display();
    }
}
