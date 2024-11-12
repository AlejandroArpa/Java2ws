class Vehicle {
    public String brand;
    public String model;
    public float maxSpeed;
    public float speed;

    Vehicle(String brand, String model, float maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.speed = 0;
    }

    public void breaking (float speedToReduce) {
        float newSpeed = speed - speedToReduce;
        if (newSpeed < 0) {
            speed = 0;
            return;
        }
        speed = newSpeed;
    }

    public void accelerating ( float speedToIncrement ) {
        float newSpeed = speed + speedToIncrement;
        if (newSpeed > maxSpeed){
            speed = maxSpeed;
            return;
        }
        speed = newSpeed;
    }
}

public class Ejercicio3 {
}
