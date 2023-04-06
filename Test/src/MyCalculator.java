
interface Solar {
	void putOn(boolean daytime) throws Exception ;
}

interface Icalculator {
	// public static final
	int MAX = 3;

	// public abstract
	int add(int a, int b);

	int sub(int a, int b);
}

abstract class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	abstract int sub(int a, int b);
}

class MyCalculator extends Calculator implements Icalculator, Solar {
	static boolean daytime = true;
	static int conditionCheck = 1;

	@Override
	public void putOn(boolean daytime) throws Exception  {
		
		if (daytime) {
			System.out.println("daytime is on");
		} else {
			throw new Exception("daytime is off");
			//System.out.println("daytime is off ----------");
		}
	}
	
	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	public static void main(String a[]) throws Exception {

		MyCalculator myCalculator1 = new MyCalculator();
		myCalculator1.putOn(daytime);
		
		MyCalculator.checkLimit();
		int r1 = myCalculator1.add(1, 2);
		System.out.println("Add on the calculator = "+r1);
		
		MyCalculator.checkLimit();
		int r2 = myCalculator1.sub(4, 2);
		System.out.println("Sub on the calculator = "+r2);

		MyCalculator.checkLimit();
		int r3 = myCalculator1.add(1, 2);
		System.out.println("Add on the calculator = "+r3);
		
		MyCalculator.checkLimit();
		int r4 = myCalculator1.sub(4, 2);
		System.out.println("Sub on the calculator = "+r4);

	}
	
	
	public static void checkLimit() throws Exception {
		if (conditionCheck > MAX) { 
			throw new Exception("reached the limit of 3");
		}
		conditionCheck++;
	}
}
