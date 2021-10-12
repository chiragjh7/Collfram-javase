import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class LearnSet {
	
	public static void main(String[] args) {

		Set<Student> studentSet = new HashSet<>();
		
		studentSet.add(new Student("Chirag", 25));
		studentSet.add(new Student("Shivam", 23));
		studentSet.add(new Student("Kamal", 21));
		studentSet.add(new Student("Vimal", 21));
		
		System.out.println(studentSet);

		
		
//		Set<Integer> set = new HashSet<>();   // O(1)
//		Set<Integer> set = new LinkedHashSet<>();
		
//		Set<Integer> set = new TreeSet<>(); // O(log n)
//		
//		set.add(32);
//		set.add(2);
//		set.add(54);
//		set.add(21);
//		set.add(65);
//		
//		System.out.println(set);
//		
//		set.remove(54);
//		System.out.println(set);
//		
//		System.out.println(set.contains(21));
//		
//		System.out.println(set.isEmpty());
//		
//		System.out.println(set.size());
//		
//		set.clear();
//		System.out.println(set);
//		
				
	}
}
