package calculateArea;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

//Child class
public class Area extends displayArea{
	
	private int radius, length, width, side1, side2, side3;
	
	//Constructor
	public Area(int radiusOfCircle) {
		radius = radiusOfCircle;
	}	
	//Constructor
    public Area(int lengthOfRectangle, int widthOfRectangle) {
		length = lengthOfRectangle;
		width = widthOfRectangle;
	}
    //Constructor
    public Area(int side1OfTriangle, int side2OfTriangle, int side3OfTriangle) {
		side1 = side1OfTriangle;
		side2 = side2OfTriangle;
		side3 = side3OfTriangle;
	}
    
    //Calculate area of circle
    public double calculateArea(int R) {
    	double area = 3.14 * R * R;
    	return area;
    }
    //Calculate area of rectangle
    public double calculateArea(int L ,int W) {
    	double area = L * W;
    	return area;
    	
    }
    //Calculate area of triangle
    public double calculateArea(int A ,int B ,int C) {
    	double S = (A + B + C) / 2;
    	double area = Math.sqrt(S * (S-A) * (S-B) * (S-C));
    	return area;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//ArrayList
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.println("Enter the Dimension (Circle / Rectangle / Triangle) :");
		String dimension = sc.nextLine();
		
		switch (dimension.toLowerCase()) {
		
		    case "circle" :
		    	System.out.println("Enter radius of circle :");
		    	int r = sc.nextInt();
		    	Area circle = new Area(r); //Object of child class
		    	list.add(circle.calculateArea(r));
		        break;
		        
		    case "rectangle" :
		    	System.out.println("Enter length of rectangle :");
		    	int l = sc.nextInt();
		    	System.out.println("Enter width of rectangle :");
		    	int w = sc.nextInt();
		    	Area rectangle = new Area(l,w); //Object of child class
		    	list.add(rectangle.calculateArea(l, w));
			    break;
			    
		    case "triangle" :
		    	System.out.println("Enter side 1 of triangle :");
		    	int a = sc.nextInt();
		    	System.out.println("Enter side 2 of triangle :");
		    	int b = sc.nextInt();
		    	System.out.println("Enter side 3 of triangle :");
		    	int c = sc.nextInt();
		    	Area triangle = new Area(a, b ,c); //Object of child class
		    	list.add(triangle.calculateArea(a, b, c));
				break;
				
			default:
				System.out.println("Enter a valid dimension");
				break;
		}
		
		//try-catch and finally block
		try {
			//loop to display area
			for (double t : list) {
				displayArea displayArea = new displayArea();
				displayArea.display(t);
			}
			   
		}
		catch (Exception e) {
			System.out.println("Unexpected Exception!");
		}
		finally {
			System.out.println("Area is calculated");
		}
	}

}
