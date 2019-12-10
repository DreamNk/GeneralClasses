package Automation_Framework;
public class Triangle {
	public static void main(String args[]) {

		for (int j = 0; j <= 10; j++) {
			for (int i = 0; i <= 10; i++) {
				if (i + j > 10) {
					System.out.print("*");
					System.out.print(" ");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}
}
