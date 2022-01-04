package Bridgelab.com;
import java.util.Scanner;
public class Arrar2D {
public static void main(String[] args) {
	int[][] arr;
	int m,n,r,c;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Value of rows for array ");
	m=sc.nextInt();
	System.out.println("Enter the value of coloum for array");
	n=sc.nextInt();
	
	arr=new int[m][n];
	
	System.out.println("Enter the value in "+m+" x "+n+"array Matrix:");
	for(r=0;r<m;r++) {
		for(c=0;c<n;c++) {
			arr[r][c]=sc.nextInt();
		}
		}
	
	System.out.println("the values in "+m+" x "+n+" Array matrix are:\n");
	for(r=0;r<m;r++) {
		for(c=0;c<n;c++) {
			System.out.println("\t"+ arr[r][c]);
		}
		System.out.println("\n");
	}
	}
}
