package 容器与泛型;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student2 implements Comparable<Object>{
	String id;	
	String name;	
	int count;	
	public String getId() {	
		return id;	
	}
	public void setId(String id) {	
		this.id = id;		
	}
	public String getName() {	
		return name;	
	}
	public void setName(String name) {	
		this.name = name;	
	}
	public int getCount() {	
		return count;	
	}
	public void setCount(int count) {	
		this.count = count;	
	}	
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", count=" + count + "]";
		}
	public Student2(String id, String name, int count) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
		}
	@Override
	public int hashCode() {
		int result;
		result = (this.name == null ? 0 : this.name.hashCode());
		result += this.id.hashCode();
		return result;
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Test_5)) {
			return false;
			}
		Test_5 s = (Test_5) o;
		if (this.id.equals(s.id)) {
			return true;
			} else {
				return false;
				}
		}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student2 s = (Student2) o;
		int result = 0;
		result = this.count > s.count ? 1 : (this.count == s.count ? 0 : -1);
		return result;
		}
	}

public class Test_5 {	
	
	public Object id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student2> list = new ArrayList<>();
        list.add(new Student2("01", "张三", 94));
        list.add(new Student2("02", "李四", 75));
        list.add(new Student2("03", "王五", 87));
        list.add(new Student2("04", "赵六", 77));    
        //按总分排序
        Collections.sort(list);
        Iterator<Student2> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}
}
