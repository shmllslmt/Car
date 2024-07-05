public class Car {
    private double speed;
    private String colour;
    private String type;
    private int numOfWheels;
    private double wheelDiameter;
    private double wheelWidth;
    // no-arg / default constructor
    Car() {
        this.speed = 0;
        this.colour = "Blue";
        this.type = "FWD";
        this.numOfWheels = 4;
        this.wheelDiameter = 17;
        this.wheelWidth = 8.5;
    }
    // parameterized constructor
    Car(String colour, String type) {
        this.speed = 0;
        this.colour = colour;
        this.type = type;

        if(type.equals("FWD") || type.equals("RWD") || type.equals("AWD"))
            this.numOfWheels = 4;
        else if(type.equals("8X8"))
            this.numOfWheels = 8;

        if(type.equals("FWD") || type.equals("AWD") || type.equals("8X8")) {
            this.wheelDiameter = 17;
            this.wheelWidth = 8.5;
        } else if(type.equals("RWD")) {
            this.wheelDiameter = 25;
            this.wheelWidth = 15;
        }
    }
    public void reset() {
        this.speed = 0;
        System.out.println("Resetting the game. Player is at the starting position. Current speed: " + speed + "km/h");
    }

    public void start() {
        this.speed = 10;
        System.out.println("Start your engine and go! Current speed: " + speed + "km/h");
    }

    public void accelerate() {
        this.speed += 50;
        System.out.println("Player is accelerating. The car now runs faster at speed: " + speed + "km/h");
    }

    public void decelerate() {
        this.speed -= 50;
        System.out.println("Player is decelerating. The car now runs slower at speed: " + speed + "km/h.");
    }

    public void stop() {
        this.speed = 0;
        System.out.println("Player stops the car. Current speed: " + speed + "km/h");
    }

    public void turnLeft() {
        System.out.println("Player is turning left...");
    }

    public void turnRight() {
        System.out.println("Player is turning right...");
    }
    public double getSpeed() {
        return speed;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public double getWheelWidth() {
        return wheelWidth;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public void setWheelWidth(double wheelWidth) {
        this.wheelWidth = wheelWidth;
    }

    @Override
    public String toString() {
        return "\nColour: " + colour +
                "\nType: " + type +
                "\nNumber of Wheels: " + numOfWheels +
                "\nWheel Diameter: " + wheelDiameter +
                "\nWheel Width: " + wheelWidth;
    }
}
