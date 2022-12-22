public class Square implements Shape{
	//data member
	int length;
	// parameterized Constructor
	Square(int length){
		this.length=length;
	}
	@Override // area method
	public int area() {
		return length*length;
	}

}