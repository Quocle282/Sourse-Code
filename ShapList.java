package kt1;

import java.util.Scanner;

public class ShapList {
	Shap sh[];
	int n;
	public void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap chieu dai danh sach:");
		n =sc.nextInt();
		sh= new Shap[n];
		for(int i=0;i<n;i++){
			//sh[i]= new hinhtron();
			sh[i].input();
		}
		sc.close();
	}
		public void display()
		{
		for(int i=0;i<n;i++){
		//	System.out.println(sh[i].getArea());
		}
		
	}
		
	
	public void sort(){
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				//if(sh[i].sxxxvrvbvjuvc)
			}
				
		}
	}
	public static void main(String args[]){
		ShapList sl= new ShapList();
		sl.input();
		sl.display();
	}
}
	