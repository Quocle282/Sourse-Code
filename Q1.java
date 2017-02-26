package kt1;
import java.util.Scanner;

public class Q1 {
	public int edgeA;
	public int edgeB;
	public int edgeC;
	public void input(){
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println(" Nhap ba canh tam giac: ");
			edgeA= sc.nextInt();
			edgeB=sc.nextInt();
			edgeC=sc.nextInt();
			
		}while(edgeA<=0||edgeB<=0||edgeC<=0);
	
	}
	public void solve(){
		//kt ddk
		if(edgeA+edgeB<edgeC||edgeB+edgeC<edgeA||edgeA+edgeC<edgeB)
		{
			System.out.println("K phai la tam giac");
		}
		else {
			
		
			if(edgeA==edgeB&&edgeA==edgeC){
				System.out.println("tam gaic deu");
			}
			else
				if(edgeA==edgeB||edgeA==edgeC||edgeC==edgeB){
					System.out.println("tam gaic can");
					
				}
				else 
					if(edgeA*edgeA+edgeB*edgeB==edgeC*edgeC||edgeA*edgeA+edgeC*edgeC==edgeB*edgeB
					||edgeC*edgeC+edgeB*edgeB==edgeA*edgeA){
						System.out.println("tam gaic vuong");
					}
					else 
						System.out.println("tam gaic thuong");
			}
	}
}
