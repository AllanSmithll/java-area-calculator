package entities;

public class Triangle {
	/* Objeto bidimensional com três lados */
	public double sideABase;
	public double sideB;
	public double sideC;
	public double height;

	public double area() {
		double p = (sideABase + sideB + sideC) / 2.0;
		return Math.sqrt(p * (p - sideABase) * (p - sideB) * (p - sideC));
	}
}
