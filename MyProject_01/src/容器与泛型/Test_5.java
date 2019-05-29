package ÈÝÆ÷Óë·ºÐÍ;

class Student2{	
	int id;	
	String name;	
	int count;	
	public int getId() {	
		return id;	
	}
	public void setId(int id) {	
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
	public Student2(int id, String name, int count) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
		}
	}

public class Test_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
