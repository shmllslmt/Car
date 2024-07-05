public class Main {
    public static void main(String[] args) {
        Car player = new Car("Blue", "RWD");
        Car opponent = new Car("Green", "RWD");

        player.start();
        player.accelerate();
        player.accelerate();
        player.turnRight();
        player.decelerate();
        player.turnLeft();
        player.stop();

        // First Version of Creating an Array of Objects
        Car[] cars1 = new Car[3];
        cars1[0] = new Car("Blue", "FWD");
        cars1[1] = new Car("Red", "FWD");
        cars1[2] = new Car("Green", "FWD");

        // Second Version of Creating an Array of Objects
        Car[] cars2 = new Car[3];
        for(int i=0; i<cars2.length; i++) {
            cars2[i] = new Car();
        }

        // Third Version of Creating an Array of Objects
        Car[] cars3 = {
            new Car("Blue", "AWD"),
            new Car("Red", "AWD"),
            new Car("Yellow", "AWD"),
            new Car("White", "AWD"),
            new Car("Green", "AWD"),
        };

        for (Car c: cars1)
            System.out.println(c);
    }
}