import java.util.HashSet;

public class Test1 {
	public static void main(String[] args) {
		String str = "toronto";
		boolean t = true;
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (hs.contains(ch)) {
				t = false;
				// System.out.println("false");
				break;
			} else {
				hs.add(ch);
			}

		}

		System.out.println(t);
	}

}
