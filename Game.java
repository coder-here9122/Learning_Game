import java.util.Scanner;
public class Game {

    public int selectShape()
	{
		Scanner sc=new Scanner(System.in);
		int x;
		do {
		System.out.println("!!===ENter 1==>TwoDShape and 2==>ThreeDShape=====!!");
		x=sc.nextInt();
		if(x<1 || x>2)
			System.out.println("This is NOT a valid choice!");
		}while(x<1 || x>2);
	return x;
	}
	
	public   TwoDShape  getTwoDShape()
	{
		Scanner sc=new Scanner(System.in);
		int twodchoice=getTwoChoice();
		if(twodchoice==1)
		{
			System.out.println("You have selected Circle");
			System.out.println("Now Enter the Radius: ");
			double r=sc.nextDouble();
			Circle c1=new Circle(r);
			return c1;
		}
		else
		{
			System.out.println("You have selected Rectangle");
			System.out.println("Now Enter the length: ");
			double l=sc.nextDouble();
			System.out.println("Now Enter the Width: ");
			double w=sc.nextDouble();
			return new Rectangle(l,w);
		}
    }
    public ThreeDShape getThreeDShape()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter from below opetions");
        System.out.println("Enter 1========>Cylinder ");
        int threedchoice=sc.nextInt();
        System.out.println("You have selected Cylinder");
        System.out.println("Enter the radius");
        double r=sc.nextDouble();
        System.out.println("enter the height");
        double h=sc.nextDouble();
        return new Cylinder(r,h);
    }
    public static  int getTwoChoice()
    {
        Scanner sc=new Scanner(System.in);
        int x;
        do{
        System.out.println("Enter from given below options");
        System.out.println("Eneter 1=====> Circle");
        System.out.println("enter 2======>Rectangle");
        System.out.println("Enter 3======> Cylinder");
        x=sc.nextInt();
        }while(x<1 || x>3);
        return x;
    }
    
}
