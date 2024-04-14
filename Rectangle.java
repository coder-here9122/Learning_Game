public class Rectangle extends TwoDShape {
    double l;
	double w;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	Rectangle(double l, double w)
	{
		System.out.println("Rectangle Object is Craeted!");
		this.l=l;
		this.w=w;
	}
	@Override
	public double getArea()
	{
		double area=l*w;
		System.out.println("Area of Rectangle is: "+area+"Sq. Unit");
		return area;
	}
	@Override
	public double getPerimeter()
	{
		double perimeter=2*(l+w);
		System.out.println("Perimeter of Rectangle is: "+perimeter+"Unit");
		return perimeter;
	}

    
}
