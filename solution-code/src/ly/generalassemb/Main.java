package ly.generalassemb;

public class Main {

    public static void main(String[] args) {

        // Instantiate a StopLight object
        StopLight stopLight = new StopLight();

        // Instantiate a Car object
        Car car = new Car("blue", "Honda", 120.0);

        // Change the color of the stop light over and over; make the car react
        for (int i = 0; i < 30; i++) {

            if (stopLight.isGreen()) {
                stopLight.setLightColor("yellow");
                car.slow();
            }
            else if (stopLight.isYellow()) {
                stopLight.setLightColor("red");
                car.stop();
            }
            else if (stopLight.isRed()) {
                stopLight.setLightColor("green");
                car.go();
            }
        }
    }
}
