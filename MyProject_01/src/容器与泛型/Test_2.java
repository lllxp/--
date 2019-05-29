package 容器与泛型;
import java.util.HashMap;
import java.util.Map;

public class Test_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student_1, String> map = new HashMap<Student_1, String>();
		
		Student_1 s1 = new Student_1("张三",19);
		Student_1 s2 = new Student_1("李四",20);
		Student_1 s3 = new Student_1("王五",21);
		
		map.put(s1,"归属地：福州");
		map.put(s2,"归属地：宁德");
		map.put(s3,"归属地：厦门");
		
		System.out.println(map);
	}
}
class Student_1 {
	String name;
	int age;
	public Student_1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student_1 [name=" + name + ", age=" + age + "]";
		}
}
