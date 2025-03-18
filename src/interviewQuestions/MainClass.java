package interviewQuestions;

public class MainClass {


    public static void main(String args[]){
        Car c1 = new Car("Red");
        Car c2 = new Car("Blue");
        Car c3 = new Car("Yellow");
        System.out.println(c3.wheels);
    }

}
class Car
{
    static int wheels;
    String color;
    Car(String color){
        this.color = color;
        wheels++;
    }

}
