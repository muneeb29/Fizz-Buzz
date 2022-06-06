public class main {

	public static void main(String[] args) {
			fizzbuzz(50);
	}
	
	public static void fizzbuzz(int num) {
		
		for(int x = 0; x < num; x++) {
	    
		if((x % 7) == 0 && (x % 5) == 0){
			System.out.println("FizzBuzz");
		}
		
		else if((x % 7) == 0){
			System.out.println("Buzz");
		}
		
		else if((x % 5) == 0) {
			System.out.println("Fizz");
		}
		
		else {
			System.out.println(x);
		}
		}
		
	}

}
