package javalanguageplayground.comparator;

import java.util.Comparator;

public class ReverseComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return -1 * o1.compareTo(o2);
	}

}
