class Static { 
	static int a = 5;
	Static() {
		a = a + 1;
	}
	
	static void output() {
		System.out.println("a : " + a);
	}

	public static void main(String[] args) {
		Static s1 = new Static();
		output();
		Static s2 = new Static();
		output();
		Static s3 = new Static();
		output();
	}
}