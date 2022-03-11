package pkg;
// a simple constructor//
class Myclass{
	int x;
	//this is constructor my class//
	Myclass(){
		x=8;
	}
}

public class constructordemo {

	public static void main(String[] args) {
	Myclass m1=new Myclass();
	Myclass m2=new Myclass();
	System.out.println(m1.x+"  " +m2.x);
	}

}
