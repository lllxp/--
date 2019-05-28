package 容器与泛型;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

class Student extends Object implements Comparable<Student>{
	int stuNo;
	String name;
	int score;
	
	public Student(int stuNo, String name, int score) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.score = score;
	}

@Override
public int compareTo(Student s) {
	// TODO Auto-generated method stub
	if (this.stuNo == s.stuNo)
		return 0;
	else if (this.score == s.score) {
		if (this.name.compareTo(s.name) == 0)
			return this.stuNo - s.stuNo;
		else
			return this.name.compareTo(s.name);
	} else
		return this.score - s.score;
}

@Override
public String toString() {
	return "Student [stuNo=" + stuNo + ", name=" + name + ", score=" + score + "]";
}

}

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student> set=new TreeSet<Student>();
		Student s1 = new Student(01, "张三", 95);
		set.add(s1);
		Student s2 = new Student(02, "李四", 86);
		set.add(s2);
		Student s3 = new Student(03, "王五", 77);
		set.add(s3);

		Iterator<Student> it= set.iterator();
		while( it.hasNext() ) {
			Student s4=it.next();
		}
		System.out.println(set);
		
	}
}
