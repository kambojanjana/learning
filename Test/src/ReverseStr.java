
public class ReverseStr {

	public static void main(String[] args) {
		String input = "Automation";
		String rev = "";
		char ch[] = input.toCharArray();
		for (int i = input.length() - 1; i >= 0; --i) { 
			rev += ch[i];
			
		}
		System.out.println(rev);
		}
		

}
