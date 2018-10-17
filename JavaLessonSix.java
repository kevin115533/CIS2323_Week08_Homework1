public class JavaLessonSix{
	public static void main(String[] args){
	
	divideByZero(2);
	}
	
	public static void divideByZero(int x){
	
	try{
	System.out.println(x/0);
	}
	
	catch(ArithmeticException e){
		System.out.println("You cant do that");
		
		System.out.println(e.getMessage());
		
		System.out.println(e.toString());
						   
		e.printStackTrace();
	}
	
	
	}
}