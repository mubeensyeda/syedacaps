package pkg;
interface shape
{
	void input();
	void area();
}	//implementing an interface
class circle implements  shape
{
	int r=4;
	double pi=3.14,ar=0;
	
	public void input()
	{
	r=5;	
	}

public void area()
{
	ar=pi*r*r;
	System.out.println("area of circle :"+ar);
}
}
public class Interfacedemo {
	
	public static void main(String[] args) {
		circle obj=new circle(); //creating an object//
		obj.area(); //accessing values//
		obj.input();
	}

}
