package entities;

public class Circle {
	/* Objeto bidimensional com nenhum lado */
	
	public double circumference;
	public double radius;
	public double diameter;

	public double area() {
		return radius * 3.14;
	}

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
