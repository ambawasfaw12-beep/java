package mid;
class Vehicles {
    protected int speed; // protected = visible to subclass

    public void start() {
        System.out.println("vehicle starting...");
    }
}

class Car extends Vehicles {
    int numDoors;

    public void playMusic() {
        System.out.println("playing music 🎵");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.playMusic();
        car.speed = 60;
        System.out.println(car.speed);


    }
}
