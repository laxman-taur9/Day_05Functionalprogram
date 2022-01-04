package Bridgelab.com;
import java.util.Scanner;
public class Quadratic {
public static void main(String[] args) {
	int a,b,c,delta;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Values of A: ");
	a=sc.nextInt();
	
	System.out.println("Enter the Values of B:");
	b=sc.nextInt();
	System.out.println("enter the Values of C:");
	c=sc.nextInt();
	
	delta=((b*b)-4 *(a*c));
	System.out.println("Delta="+delta);
	
	double root1X=((-b + Math.sqrt(delta))/(2*a));
	System.out.println("Root 1 of X="+root1X);
	
	double root2X=((-b -Math.sqrt(delta))/(2*a));
	System.out.println("Root 2 of X ="+root2X);
}
}
