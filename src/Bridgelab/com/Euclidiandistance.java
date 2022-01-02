package Bridgelab.com;

public class Euclidiandistance {
public static void main(String[] args) {
	int x,y;
	double euclidenadistance=0.0;
	
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);
	
	System.out.println("the value for point X:"+ x);
	System.out.println("The vlaue for point Y:"+ y);
	
	euclidenadistance=Math.sqrt(Math.pow(x,x) +Math.pow(y,y));
	System.out.println("Euclidean Distance:"+euclidenadistance);

}
}
