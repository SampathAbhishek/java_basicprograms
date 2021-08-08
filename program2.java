// i.p -> 123.456  
// o.p -> 456.123.    


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.nextLine();
		String [] characters = x.split("[.]");
		int [] numbers = new int[2];
		int counter=0;
		for(String c:characters){
		    numbers[counter++]=Integer.parseInt(c);
		}
		int temp;
		temp=numbers[0];
		numbers[0]=numbers[1];
		numbers[1]=temp;
		System.out.print(numbers[0]+"."+numbers[1]);
	}
}
