import java.util.Set;
import java.util.HashSet;
public class Hello
{
	public static void main(String[] args) {
		Pen pen1 = new Pen("one",1);
		Pen pen2 = new Pen("one",1);
		Set<Pen> penval = new HashSet<>();
		penval.add(pen1);
		penval.add(pen2);
		System.out.println(penval.size());
	}
}
class Pen
{
	 int price;
	 String color;
	public Pen(String color,int price) {
		this.price=price;
		this.color=color;
	}
	
	@Override
	public boolean equals(Object obj) {
		Pen that = (Pen)obj;
		boolean isEqual = (this.price == that.price) && 
				(this.color.equals(that.color));
		return(isEqual);
	}
	@Override
	public int hashCode() {
		return(price + color.hashCode());
	}
}
