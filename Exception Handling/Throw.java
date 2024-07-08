class Throw {
	static void eligible(int age) {
		if (age > 18 ) {
			throw5
 new ArithmeticException("Not Eligible");
		}
		else {
			System.out.println("Can Vote");
		}
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		try {
			eligible(19);
		}
		catch(Exception e) {
			System.out.println("Handled Successfully");
		}
		System.out.println("Ends");
	}
}
