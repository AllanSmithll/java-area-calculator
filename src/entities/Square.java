// 31/01/2023
package entities;

public class Square {
	/* Objeto bidimensional com quatro lados */
		public double sideA;
		public double sideB;
		public double sideC;
		public double sideD;

		public double area() {
			return Math.pow(sideA, 2);
		}
}
