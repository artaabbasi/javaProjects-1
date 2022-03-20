import java.util.Scanner;

public class firstRunner {

    private Car userCar = new Car(null, null, null, null);

    public void assign(){
        try (Scanner inputCar = new Scanner(System.in)) {
            System.out.println("Enter your cars information: ");
            System.out.println("your cars model: ");
            userCar.carModel = inputCar.nextLine();
            System.out.println("your cars name: ");
            userCar.carName = inputCar.nextLine();
            System.out.println("your cars price: ");
            userCar.carPrice = inputCar.nextLine();
            System.out.println("your cars owner: ");
            userCar.carOwner = inputCar.nextLine();
        } 
        System.out.println("stored.");
        
    }

    public void display(){
        System.out.println("Here is your cars information: ");
        System.out.println("your cars Model: " + userCar.carModel);
        System.out.println("your cars Name: " + userCar.carName);
        System.out.println("your cars Price: " + userCar.carPrice);
        System.out.println("your cars Owner: " + userCar.carOwner);
    }
    public static void main(String[] args){
        firstRunner myObj = new firstRunner();
        myObj.assign();
        myObj.display();
    }
}
