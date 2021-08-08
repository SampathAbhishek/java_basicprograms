import java.util.Scanner;
import java.util.Arrays;

public class Main{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] vowels = input.split("[:]");
        int [] numbers = new int[vowels.length]; 
        int counter=0;
        for(String ch:vowels){
            numbers[counter++]=Integer.parseInt(ch);        
        }
        Arrays.sort(numbers);
        for(int i:numbers){
            System.out.print(i+" ");
        }
    }
}
