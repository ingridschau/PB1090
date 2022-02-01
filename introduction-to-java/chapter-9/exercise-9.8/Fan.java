public class Fan {
    //Constants
    static int SLOW = 1;
    static int MEDIUM = 2;
    static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String colour;

    Fan() {
        setSpeed(SLOW);
        setOn(false);
        setRadius(5);
        setColour("blue");
    }

    public void setSpeed(int speed) {
        this.speed = speed;

    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

	public String toString() {
		if (getOn())
			return ("Speed:" + getSpeed() + "\nColor: " + getColour() + "\nRadius: " + getRadius());
		else
			return ( "\nColor: " + getColour() + "\nRadius: " + getRadius() + "\nFan is off.");
	}
}