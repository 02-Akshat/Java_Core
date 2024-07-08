class Exception {
	public static void main(String[] args) {
		try { 
			int[] arr = {1,2,3};
			System.out.println(arr[5]);
			
			int result = 10/0;
	
			String text = null;
			System.out.println(text.length());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of Bounds " + e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Error " + e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer Encountered " + e.getMessage());
		}
		finally {
			System.out.println("This is Finally Block");
		}
	}
}