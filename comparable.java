import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Hello
{
	public static void main(String[] args) {
       Student student1 = new Student(95,15);
       Student student2 = new Student(67,12);
       List<Student> info = new ArrayList<>();
       info.add(student1);
       info.add(student2);
       Collections.sort(info);
       for(Student st:info) {
    	  System.out.print("Marks "+st.getMarks()+"  "+
         "Age: "+st.getAge());
    	  System.out.println();
       }

	}
}

class Student implements Comparable<Student>
{
	private int marks;
	private int age;
	public Student(int marks , int age) {
		this.marks = marks;
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Student o) {
		Student that = o;
		if(this.age>that.age) {
			return 1;
		}
		else if(this.age<that.age) {
			return -1;
		}
		return(0);
	}
}
