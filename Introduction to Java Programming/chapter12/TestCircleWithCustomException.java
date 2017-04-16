package chapter12;

public class TestCircleWithCustomException {

	/** Main method */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
}

class CircleWithCustomException {
	/** The radius of the circle */
	private double radius;
	
	/** The number of objects created */
	private static int numberOfObjects = 0;
	
	/** Construct a circle with radius 1 */
	public CircleWithCustomException() 
		throws InvalidRadiusException { // declare exception
		this(1.0);
	}
	
	/** Construct a circle with a specified radius */
	public CircleWithCustomException(double newRadius) 
		throws InvalidRadiusException {
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double newRadius) 
		throws InvalidRadiusException {
		if (newRadius > 0) 
			radius = newRadius;
		else
			throw new InvalidRadiusException(newRadius);
	}
	
	/** Return numberOfObjects */
	public static int getNumberOfObject() {
		return numberOfObjects;
	}
	
	/** Return the area of this circle */
	public double findArea() {
		return radius * radius * 3.14159;
	}
}
