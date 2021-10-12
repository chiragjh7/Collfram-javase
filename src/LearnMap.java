import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
	public static void main(String[] args) {
		Map<String, Integer> nums = new TreeMap<>();
		
		nums.put("One", 1);
		nums.put("Two", 2);
		nums.put("Three", 3);
		nums.put("Four", 4);
		nums.put("Five", 5);
		
		
//		if(!nums.containsKey("Two"))
//			nums.put("Two", 23);
			
//		nums.putIfAbsent("Two", 23);
			
		System.out.println(nums);
		
		System.out.println(nums.containsValue(3));
		
		System.out.println(nums.isEmpty());
		
		nums.remove("Three");
		System.out.println(nums);
		
		nums.clear();
		System.out.println(nums);
//		
//		for(Map.Entry<String, Integer> e: nums.entrySet()) {
//			System.out.println(e);
//			
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
//		
//		for(String key: nums.keySet())
//			System.out.println(key);
//		
//		for(Integer val: nums.values())
//			System.out.println(val);
	}
}
