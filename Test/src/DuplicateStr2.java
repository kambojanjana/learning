import java.util.HashSet;

public class DuplicateStr2 {
	public static void main(String[] args) {
		String str = "toronto";
		boolean t = true;
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (set.contains(ch)) {
				t = false;
				// System.out.println("false");
				break;
			} else {
				set.add(ch);
			}

		}

		System.out.println(t);
	}

}
