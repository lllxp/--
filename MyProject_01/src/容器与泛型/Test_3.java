package �����뷺��;
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
		Candidate p1 = new Candidate("����", 1);
		Candidate p2 = new Candidate("����", 2);
		Candidate p3 = new Candidate("����", 3);
		
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);
		Scanner sc = new Scanner(System.in);
		System.out.println("����10��ѡ�����ύ�ĺ�ѡ�˱�ţ��ÿո��������");
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
		map.forEach((key,value)->System.out.println(key+ "�ź�ѡ�ĵ�Ʊ��Ϊ��"+value+"Ʊ"));
	}

}
