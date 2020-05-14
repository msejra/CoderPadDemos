import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StringExternalSortingDemo {
	public static void main(String args[]) {
		List<String> list1 = new ArrayList<>(Arrays.asList("Ajay", "Raja",
				"Keshav", "List", "Set", "Elephant", "Drone"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Elephant", "Set",
				"Ajay", "Raja", "Drone", "List", "Keshav"));
		Map<Integer, String> map = new TreeMap<>();
		for (String value : list1) {
			map.put(list2.indexOf(value), value);
		}
		map.forEach((a, b) -> System.out.print(b+"  "));
	}
}
