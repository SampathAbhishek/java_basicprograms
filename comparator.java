import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Hello
{
	public static void main(String[] args) {
       Student student1 = new Student(95,15);
       Student student2 = new Student(67,15);
       List<Student> info = new ArrayList<>();
       info.add(student1);
       info.add(student2);
       Collections.sort(info,new compareByNameThenMarks());
       for(Student st:info) {
    	  System.out.print("Marks "+st.getMarks()+"  "+
         "Age: "+st.getAge());
    	  System.out.println();
       }

	}
}

class Student 
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
}




class compareByNameThenMarks implements  Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		 if(o1.getAge() == o2.getAge()) {
			 //if ages are equal sort in asceneding order acco
			 //rding to marks.
			 return(o1.getMarks()-o2.getMarks());
		 }
		 else
		 {
			 //descing order of marks.
		return (o2.getMarks()-o1.getMarks());
	    }
	}
