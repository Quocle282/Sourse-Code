package kt1;

abstract class Shap {
	final double PI = 3.14;
	double area;
	double volume;
	public void display(){
		System.out.println("area: "+ area);
		System.out.println("volume: "+volume);
	}
	abstract void input();
	abstract void getArea();
	abstract void getvolume();
	
}
