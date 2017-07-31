import java.lang.Math;
/*
 * Create three subclasses Circle, Rectangle and Triangle that extends Figure class and define both
the methods. Write a program that will find the area and perimeter of 3 Figures and print the
details for all.
 */
	
	abstract class Shape
	{
	 abstract void area();
	 abstract double perimeter();
	 double area;
	 double perimeter;
	}

	class Triangle extends Shape
	{ 
	 double b=50,h=15,l=30;
	private double p;
	 void area()
	 {
	  area = (b*h)/2;
	  System.out.println("area of Triangle -->"+area);// printing area
	 }
	 
	 public double perimeter() {
	        // P = a + b + c
	        perimeter = l + b + h;
	        System.out.println("perimeter of Triangle -->"+perimeter);// printing perimeter
			return p; 
	    }
	}

	class Rectangle extends Shape
	{
	 double w=70,h=20,l=30;
	private double p;
	 void area()
	 {
	  area = w*h;
	  
	  System.out.println("area of Rectangle -->"+area);// printing area
	 }
	 
	 public double perimeter() {
	        
			// P = 2(w + l)
	        perimeter = 2 * (w + l);
	        System.out.println("perimeter of Rectangle -->"+perimeter);// printing perimeter
			return p; 
	    }
	}

	class Circle extends Shape
	{
	 double r=5;
	 double pi = Math.PI;
	private double p;
	 void area()
	 {
	  area = Math.PI * r * r;
	  System.out.println("area of Circle -->"+area);// printing area
	 }
	 
	 public double perimeter() {
	        // P = 2πr
		  perimeter = 2 * pi * r;
		  System.out.println("perimeter of Circle -->"+perimeter);
		return p; 
	    }
	}

	class Area
	{
	 public static void main(String [] args)// Main methods starts
	 {
	  Triangle t= new Triangle();
	  Triangle t1 = new Triangle();
	  Rectangle r =new Rectangle();
	  Rectangle r1 =new Rectangle();
	  Circle c =new Circle();
	  Circle c1 =new Circle();
	  t.area();
	  t1.perimeter();
	  r.area();
	  r1.perimeter();
	  c.area();
	  
	  c1.perimeter();
	 }
	}// class closed
