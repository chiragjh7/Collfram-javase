import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Chirag", 25));
		list.add(new Student("Rohit", 23));
		list.add(new Student("Carry", 26));
		list.add(new Student("Ashish", 14));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
//		List<Integer> list = new ArrayList<>();
//		list.add(4);
//		list.add(1);
//		list.add(3);
//		list.add(2);
//		
//		System.out.println(Collections.min(list));
//		System.out.println(Collections.max(list));
//		System.out.println(Collections.frequency(list, 2));
//		
//		Collections.sort(list);
//		System.out.println(list);
//		
//		Collections.sort(list, Comparator.reverseOrder());
//		System.out.println(list);
		
		
		
		
		
		
		
		
	}
}
