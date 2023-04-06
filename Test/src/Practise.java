import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Practise {
	public static void main(String[] args) {
		int[] arr1= {5,9,1,2};
		int[] arr2= {8,0,2};
		System.out.println(isCommonElementPresent(arr1 , arr2));}
	
		public static boolean isCommonElementPresent(int[] arr1, int[] arr2) {
			HashSet<Integer> set=new HashSet();
			for(int num1:arr1) {
				set.add(num1);
			}
			for(int num2: arr2) {
				if(set.contains(num2)) {
				return true;
				
				}	
			
		}
			return false;
		
			}
		}
		



