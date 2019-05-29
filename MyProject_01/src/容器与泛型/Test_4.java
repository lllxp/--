package 容器与泛型;

import java.util.Iterator;
import java.util.LinkedList;

public class Test_4 {
	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		//队列
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
		//栈
		Stack sta= new Stack();
		System.out.print("入栈：");
		sta.inStack("小张");
		sta.inStack("小李");
		sta.inStack("小王");
		System.out.println( sta.toString() );
		System.out.print("出栈：");
		if(!sta.isEmpty()) {
			sta.outStack();
		}
		System.out.println(sta.toString());
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
//栈的实现
class Stack{
	private LinkedList<Object> linklist;	
	public Stack(){
		linklist = new LinkedList<Object>();
	}	
	//入栈操作
	public void inStack(Object obj){
		linklist.addFirst(obj);
	}
	//出栈操作
	public void outStack(){
		linklist.removeFirst();
	}
	//判断栈是否为空
	public boolean isEmpty(){
		return linklist.isEmpty();
	}	
	@Override
	public String toString() {
		Iterator<Object> iterator = linklist.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "    ");
		}
		return null;
	}
}
