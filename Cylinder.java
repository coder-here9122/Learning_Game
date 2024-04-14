public class Cylinder extends ThreeDShape {
    double r;
	double h;
	Cylinder()
	{
		
	}
	Cylinder(double r, double h)
	{
		System.out.println("Cylinder Object is Created");
		this.r=r;
		this.h=h;
	}
	@Override
	public double getVolume()
	{
		double volume=3.14*r*r*h;
		System.out.println("Volume oc Cylinder is: "+volume+"Cube. Unit");
		return volume;
	}
	@Override
	public double getLateralSurfaceArea()
	{
		double lsa=2*Math.PI*r*h;
		System.out.println("Lateral Surfae Area of Cylinder is: "+lsa+"Sq. Unit");
		return lsa;
	}
	@Override
	public double getTotalSurfaceArea()
	{
		double tsa=2*Math.PI*r*(r+h);
		System.out.println("Total Surfae Area of Cylinder is: "+tsa+"Sq. Unit");
		return tsa;
	}
    
}
