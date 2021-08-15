import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
public class Hello{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char [] characters = str.toCharArray();
		int n = str.length();
		int [] value = new int[n];
		Map<Character,Integer> numbers = new TreeMap<>();
		int[] freq = new int[n];
		for(int i=0;i<n;i++) {
			freq[i]=1;
			char x = characters[i];
			for(int j=i+1;j<n;j++) {
				if(x==characters[j]) {
					freq[i]++;
					characters[j]='0';
				}
			}
			if(characters[i]!='0') {
			numbers.put(characters[i],freq[i]);
			}
		}
		
	    for(Entry<Character,Integer> entry:numbers.entrySet()) {
	    	System.out.print(entry.getKey()+""+entry.getValue());
	    }
		
		
	}
}
