public class Car {
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleratiom;

    Car() {
        this("Mazda", 190, false, 10);
    }


    public Car(String brand, int horsePower, boolean isAwd, float acceleratiom) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleratiom = acceleratiom;
    }
    void start() {
        System.out.println(brand + " has been started");
    }
    float countSpeed(float time) {
        return (100/acceleratiom) * time;
    }
}
