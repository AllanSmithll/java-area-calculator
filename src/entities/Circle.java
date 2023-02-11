package entities;

public class Circle {
	/* Objeto bidimensional com nenhum lado */
	
	public double circumference;
	public double radius;
	public double diameter;

	/**
	 * @return Circle's area
	 */
	public double area() {
		return radius * 3.14;
	}
}
