class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue){
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }
}

class MountainBike extends Bicycle {
    public int  seatHeight;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}

public class Main {
    public static void main(String args []){
        Bicycle bikeA = new Bicycle(5, 5, 5);
        System.out.println("Speed: " + bikeA.speed);
        bikeA.speedUp(2);
        System.out.println("Speed: " + bikeA.speed);
    }
}