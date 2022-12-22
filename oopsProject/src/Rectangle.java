public class Rectangle extends Square{
	//data member
	int width;
	// parameterized constructor
	Rectangle(int length,int width){
		super(length);
		this.width = width;
	}
	// area method
	public int area() {
		return length*width;
	}
}