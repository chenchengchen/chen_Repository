
public class Test {
	public static void main(String[] args) {
		int h=1;
		for (int i = 4; i > 0; i--) {
			
			for (int j = 0; j<i; j++) {
				System.out.print("*");
				
			}
			for (int j = i; j> 0; j--) {
				System.out.print(" ");
				
				
			}
			
			
			System.out.println();
		}
		
	}
}
