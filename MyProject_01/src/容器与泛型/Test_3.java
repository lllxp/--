package 容器与泛型;
import java.util.HashMap;

class Candidate{
	
	String name;
	int count;
	public Candidate(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
}

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		Candidate p1 = new Candidate("张三", 0);
		Candidate p2 = new Candidate("李四", 0);
		Candidate p3 = new Candidate("王五", 0);
	}

}
