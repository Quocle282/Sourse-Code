package kt1;

import java.util.Scanner;

public class hinhtron {
	private double radius;
	public void input(){
		Scanner sc=new Scanner(System.in);
		radius =sc.nextDouble();
		
	}
	public double getArea(){
		return  radius*radius;
	}
	public double getvolume(){
		return 0;
	}
}
