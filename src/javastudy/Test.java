package javastudy;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.scanner();
	}
	
	public void scanner() {
		System.out.println("hello java");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		
		System.out.println(number);
		scanner.close();
	}
}