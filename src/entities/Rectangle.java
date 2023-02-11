package entities;

public class Rectangle {
	public double sideABase;
	public double sideBBase;
	public double sideCHeight;
	public double sideDHeight;

	/**
	 * @return Rectangle's area
	 */
	public double area() {
		return sideABase * sideCHeight;
	}
}
