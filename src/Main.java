import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		System.out.print("Enter year: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		Calendar calendar = new Calendar( Integer.parseInt(str) );
		
	}
}
