package kt1;

import java.util.Scanner;

public class cube {
	private double a,b,c;
	public void input(){
		Scanner sc=new Scanner(System.in);
		a =sc.nextDouble();
		b =sc.nextDouble();
		c =sc.nextDouble();
		
	}
	public double getArea(){
		return  2*(a*b+b*c+c*a);
	}
	public double getvolume(){
		return a*b*c;
	}
}
