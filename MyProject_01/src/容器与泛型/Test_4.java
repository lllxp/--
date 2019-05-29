package 容器与泛型;

import java.util.Iterator;
import java.util.LinkedList;

public class Test_4 {
	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		MyQue MyQue = new MyQue();
		System.out.print("入队:");
		MyQue.inQueue("张三");
		MyQue.inQueue("李四");
		MyQue.inQueue("王五");
		System.out.println(MyQue.toString());
		System.out.print("出队:");
		if(!MyQue.isEmpty()) {
			MyQue.outQueue();
		}
		System.out.println(MyQue.toString());
		
	}
}


//队列的实现
class MyQue{	
	private LinkedList<Object> linklist;
	public MyQue(){
		linklist = new LinkedList<Object>();
	}
	//入队操作
	public void inQueue(Object obj){
		linklist.addLast(obj);
	}
	//出队操作
	public void outQueue(){
		linklist.removeFirst();
	}
	//判断队列是否为空
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