package Shape;

public class Circle extends Shape{
	private double radius;
	private static final double PI = 3.141592;
	
	Circle() {
		radius = 0;
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	void setRadius() {
		this.radius = radius;
	}
	
	double toArea() {
		double area = radius*radius*PI;
		super.setArea(area);
		return area;
	}
	
	int toArea(int radius) {
		int area = (int) (radius*radius*PI);
		super.setArea(area);
		return area;
	}
	
	double toArea(double radius) {
		double area = radius*radius*PI;
		super.setArea(area);
		return area;
	}
	
	@Override
	public String toString() {
		return "넓이는 " + super.getArea() + "입니다.";
	}
}