package chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {
	public static void main(String[] args) {

		//1. ArrayList
		
		List<String> arrayList = new ArrayList();
		arrayList.add("다"); 
		arrayList.add("마");
		arrayList.add("나");
		arrayList.add("가");
		System.out.println(arrayList);
		
		//2. Vector
		
		List<String> vector = new Vector();
		vector.add("다"); 
		vector.add("마");
		vector.add("나");
		vector.add("가");
		System.out.println(vector);		
		
		//3. LinkedList
		
		List<String> linkedlist = new LinkedList();
		linkedlist.add("다"); 
		linkedlist.add("마");
		linkedlist.add("나");
		linkedlist.add("가");
		System.out.println(linkedlist);
		
		
	}
}
