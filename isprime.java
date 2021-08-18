import java.util.Scanner;

public class Hello{
	
	public void calculate(boolean check[],int n) {
		
		check[0]=check[1]=false;
		for(int i=2;i<=n;i++) {
			check[i]=true;
		}
		for(int p=2;p*p<=n;p++) {
			if(check[p]==true) {
				for(int i=p*p;i<=n;i+=p) {
					check[i]=false;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean [] check = new boolean[n+1];
		Hello obj = new Hello();
		obj.calculate(check,n);
		System.out.println();
		for(int i=2;i<=n;i++) {
			if(check[i]==true) {
			System.out.print(i+" ");
			}
		}
	}
}

