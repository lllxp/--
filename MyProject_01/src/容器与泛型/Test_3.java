package 容器与泛型;
import java.util.HashMap;
import java.util.Scanner;

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
		Candidate p1 = new Candidate("张三", 1);
		Candidate p2 = new Candidate("李四", 2);
		Candidate p3 = new Candidate("王五", 3);
		
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);
		Scanner sc = new Scanner(System.in);
		System.out.println("输入10个选举人提交的候选人编号（用空格隔开）：");
		String temp = sc.nextLine();
		String[] t = temp.split(" ");
		int[] num = new int[20];	
		for (int i = 0; i < t.length; i++) {
			
			num[i] = Integer.parseInt(t[i]);
			
		}
		for(int i=0;i<num.length;i++) {

			Integer j = (Integer) map.get(num[i]);

			if(map.containsKey(num[i]))

				map.put(num[i],++j);
		}
		map.forEach((key,value)->System.out.println(key+ "号候选的得票数为："+value+"票"));
	}

}
