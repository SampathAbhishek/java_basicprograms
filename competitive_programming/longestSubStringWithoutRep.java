import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class MyClass {
    public static void main(String args[]) {
     int n;
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     Set <Character> input = new HashSet<>();
     int j=0;
     String current="";
     String Longest="";
     for(int i=0;i<str.length();){
         
         char c = str.charAt(i);
         if(input.contains(c)){
             input.clear();
             current="";
             i=++j;
         }
         else{
             input.add(c);
             current+=c;
             ++i;
         }
         if(current.length()>Longest.length())
		{
			Longest=current;
		}
     }
     System.out.println(Longest);
    }
}
