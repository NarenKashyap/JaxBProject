package org.testlist;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Test {

	
public static void main(String[] args) {
	System.out.println("hello");
	//Employee e = new Employee();
	
	List<Employee> list = new ArrayList<>();
	
	
	
	for(int i = 1000; i>=0; i--){
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date date = new Timestamp(System.currentTimeMillis());
		list.add(new Employee(i, "hello "+i, date));
	}
	//System.out.println(list);
	//List<Employee> sortedList = sortaList(list);
	System.out.println(list);
}

public static List<Employee> sortaList(List<Employee> list){

	Collections.sort(list, new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.getJoinDate() != null && o2.getJoinDate() != null){
			return o1.getJoinDate().compareTo(o2.getJoinDate());
			}
			return 0;
		}
		
	});
	
	return list;

}

}
