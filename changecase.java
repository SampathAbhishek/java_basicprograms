import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int y;
		for(int counter=0;counter<str.length();counter++){
		    char x = str.charAt(counter);
		if((int)x>=65 && (int)x<=90){
		    y = (int)x + 32;
		}
		else{
		    y = (int)x- 32;
		}
		System.out.print((char)y);
		}
	}
}
