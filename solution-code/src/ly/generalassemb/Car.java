package ly.generalassemb;

/**
 * Created by charlie on 10/11/16.
 */
public class Car {

    // Member variables
    private String mColor, mBrand;
    private double mTopSpeed;


    // Constructor
    public Car(String color, String brand, double topSpeed) {
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }


    // Methods
    public void go() {
        System.out.println("The " + mColor + " " + mBrand + " accelerates.");
    }

    public void slow() {
        System.out.println("The " + mColor + " " + mBrand + " decelerates.");
    }

    public void stop() {
        System.out.println("The " + mColor + " " + mBrand + " stops.");
    }

    // Getter and setter methods
    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public String getBrand() {
        return mBrand;
    }

    public void setBrand(String brand) {
        mBrand = brand;
    }

    public double getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        mTopSpeed = topSpeed;
    }
}
