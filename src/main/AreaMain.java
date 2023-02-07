// 31/01/2023
// Projeto de cálculo de áreas feito por Allan Amâncio
package main;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
import entities.Triangle;
import entities.Circle;
import entities.Rectangle;
import entities.Rhombus;
import entities.Square;
import entities.Trapeze;

public class AreaMain {
	
   public static void printMenu(String[] options) {
		for (String option: options) {
			System.out.println(option);
		}
		System.out.print("Choose your option > ");
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String[] options = {"1 - Triangle's area",
							"2 - Square's area",
							"3 - Circle's area",
							"4 - Rectangle's area",
							"5 - Rhombus's area",
							"6 - Trapeze's area",
							"7 - Exit"
		};

		Scanner sc = new Scanner(System.in);
		
		Triangle x;
	    Square y;
	    Circle z;
	    Rectangle a;
	    Rhombus b;
	    Trapeze c;
		x = new Triangle();
		y = new Square();
		z = new Circle();
		a = new Rectangle();
		b = new Rhombus();
		c = new Trapeze();
		
		int option = 1;
        while (option!=7){
            printMenu(options);
            try {
                option = sc.nextInt();
                
                if (option == 1 ) {
                	System.out.print("Base > ");
            		x.sideABase = sc.nextDouble();
            		System.out.print("Height > ");
            		x.height = sc.nextDouble();
            		
            		double areaTriangle = (x.sideABase * x.height) / 2;
            		System.out.printf("The area of Triangle is %.3fm²%n", areaTriangle);
                }
                
                else if (option == 2) {
                	System.out.print("What is the value of the side? ");
                	y.sideA = sc.nextDouble();
                	
                	double areaSquare = Math.pow(y.sideA, 2);
                	System.out.printf("The area of the Square is %.3fm²%n", areaSquare);
                }
                
                else if (option == 3) {
                	System.out.print("What is the circle's radius? ");
                	z.radius = sc.nextDouble(); 
                	
                	double areaCircle = 3.14 * z.radius;
                	System.out.printf("The area of the Circle is %.3fm²%n", areaCircle);
                }
                
                else if (option == 4) {
                	System.out.print("Base > ");
                	a.sideABase = sc.nextDouble();
                	System.out.print("Height > ");
                	a.sideCHeight = sc.nextDouble();
                	
                	double areaRectangle = a.sideABase * a.sideCHeight;
                	System.out.printf("The area of the Rectangle is %.3fm²%n", areaRectangle);
                }
                
                else if (option == 5) {
                	System.out.print("Larger diagonal > ");
                	b.largerDiagonal = sc.nextDouble();
                	System.out.print("Smaller diagonal > ");
                	b.smallerDiagonal = sc.nextDouble();
                	
                	double areaRhombus = (b.largerDiagonal * b.smallerDiagonal) / 2;
                	System.out.printf("The area of the Rhombus is %.3fm²%n", areaRhombus);
                }
                
                else if (option == 6) {
                	System.out.print("Larger base > ");
                	c.baseLarger = sc.nextDouble();
                	System.out.print("Smaller base > ");
                	c.baseSmaller = sc.nextDouble();
                	System.out.print("Height > ");
                	c.height = sc.nextDouble();
                	
                	double areaTrapeze = ((c.baseLarger + c.baseSmaller) * c.height) / 2;
                	System.out.printf("The area of the Trapeze is %.3fm²%n", areaTrapeze);
                }
                	
            }
            
            catch (InputMismatchException ex){
                System.out.println("Please enter an double value between 0.001 and " + options.length + "meters.");
                sc.next();
            }
            catch (Exception ex){
                System.out.println("An unexpected error happened. Please try again:");
                sc.next();
            }
        }
		
        System.out.print("End of program.");
		sc.close();
	}

}
