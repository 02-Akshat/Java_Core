class Student {
	int rollNo;
	String name;
	long phoneNo;
	
	void input(int rollNo, String name, long phoneNo) {
		this.rollNo = rollNo;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	void output() {
		input(01,"Akshat",9376919440l);
		System.out.println("Roll No. : " + rollNo);
		System.out.println("Name : " + name);
		System.out.println("Phone No. : " + phoneNo);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.output();
	}
}