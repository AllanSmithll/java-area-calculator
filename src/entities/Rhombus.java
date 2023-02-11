package entities;

public class Rhombus {
	public double sideA;
	public double sideB;
	public double sideC;
	public double sideD;
	public double largerDiagonal;
	public double smallerDiagonal;

	/**
	 * @return Rhombus's area
	 */
	public double area() {
		return (largerDiagonal * smallerDiagonal) / 2;
	}
}
