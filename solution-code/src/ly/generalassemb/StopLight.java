package ly.generalassemb;

/**
 * Created by charlie on 10/11/16.
 */
public class StopLight {

    // Member variable
    private String mLightColor;


    // Constructor
    public StopLight() {

        // Set the color of a new light to green by default
        mLightColor = "green";
    }


    // Methods
    public boolean isRed() {
        return mLightColor.equals("red");
    }

    public boolean isYellow() {
        return mLightColor.equals("yellow");
    }

    public boolean isGreen() {
        return mLightColor.equals("green");
    }

    public void setLightColor(String newColor) {

        // Check if the input is valid before updating mLightColor
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") ||
                newColor.equalsIgnoreCase("green")) {

            mLightColor = newColor;
            System.out.println("The light's color has changed to " + mLightColor);
        }
        else {
            System.out.println("Invalid input; the light's color remains " + mLightColor);
        }

    }
}
