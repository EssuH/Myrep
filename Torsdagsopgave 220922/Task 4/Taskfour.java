public class Taskfour {
	
	public static void main (String[]args){

			int amount = 10;
			int a = 0; 
			int b = 1; 

			for(int i = 0; i<amount;i++) {
				int fib = a + b; 
				a = b; 
				b = fib; 
					System.out.println(fib);
			}
		}

	}
