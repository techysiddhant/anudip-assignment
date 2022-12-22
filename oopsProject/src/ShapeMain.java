public class ShapeMain {

	public static void main(String[] args) {
		// instance of rectangle class
		Rectangle r1 =  new Rectangle(2,2);
		// instance of Square class
		Square s1 =  new Square(2);
		//print the area of rectangle
		System.out.println("Area of rectangle is : "+r1.area());
		//print the area of square
		System.out.println("Area of Square is : "+s1.area());
	}

}