package �����뷺��;

import java.util.Iterator;
import java.util.LinkedList;

public class Test_4 {
	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		MyQue MyQue = new MyQue();
		System.out.print("���:");
		MyQue.inQueue("����");
		MyQue.inQueue("����");
		MyQue.inQueue("����");
		System.out.println(MyQue.toString());
		System.out.print("����:");
		if(!MyQue.isEmpty()) {
			MyQue.outQueue();
		}
		System.out.println(MyQue.toString());
		
	}
}


//���е�ʵ��
class MyQue{	
	private LinkedList<Object> linklist;
	public MyQue(){
		linklist = new LinkedList<Object>();
	}
	//��Ӳ���
	public void inQueue(Object obj){
		linklist.addLast(obj);
	}
	//���Ӳ���
	public void outQueue(){
		linklist.removeFirst();
	}
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		return linklist.isEmpty();
	}
	@Override
	public String toString() {
		Iterator<Object> iterator = linklist.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "   ");
		}
		return null;
	}
}