/*
1.shallow copy-one object two refernces.
2.deep copy - different objects but manually we need to copy.
*/
class Cloning
{
    public int i,j;
    public Cloning(){
        i = 5;
        j = 6;
    }
    public int get_value(){
        return(i+j);
    }
}
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Cloning obj = new Cloning();
		//shallow copy;
		//In shallow copy we have only one object with two refernces.change in one can affect the other.
		Cloning obj1=obj;
		obj.i=11;
		obj.j=12;
		System.out.println(obj1.get_value());
		System.out.println(obj.get_value());
		//deep copy;
		//but here u need to copy manually each of the object's instance variables by yourself.
		Cloning obj2 = new Cloning();
		obj2.i=obj1.i;
		obj2.j=obj1.j;
		System.out.println(obj2.get_value());
	}
}
