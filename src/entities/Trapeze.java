package entities;

public class Trapeze {
	public double baseLarger;
	public double baseSmaller;
	public double sideA;
	public double sideB;
	public double height;

	/**
	 * @return Trapeze's area
	 */
	public double area() {
		return ((baseLarger + baseSmaller) * height) / 2;
	}
}
