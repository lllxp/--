package 容器与泛型;

import java.util.HashSet;
import java.util.Set;

class People{	
	Integer id;
	String name;
	public People(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + "]";
		}
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
			}
		if (o == null || getClass() != o.getClass()) {
			return false;
			}
		People people = (People) o;	
		return id.equals(people.id);
		}
	@Override
	public int hashCode() {
		return id.hashCode();
		}
	}

public class Test_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<People> hashSet = new HashSet<>();
		People p1 = new People(1,"张三");
		People p2 = new People(2,"李四");
		People p3 = new People(1,"张三");
		
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.forEach(str -> System.out.println(str));
	}

}
