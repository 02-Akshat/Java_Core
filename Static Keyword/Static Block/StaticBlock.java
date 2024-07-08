class StaticBlock { 
	
	StaticBlock() {
		System.out.println("Constructor");
	}

	static void show() {
		System.out.println("show() Method");
	}
		
	static{System.out.println("Static Block");}
		
	{System.out.println("Normal Block");}
		
	public static void main(String[] args) {
		show();
		StaticBlock sb1 = new StaticBlock();
	}
}