package decimalToBinary;

import java.util.Scanner;

public class ConverterStack {
	public static void main(String[] arg) {
		//I copied Stack class from classwork. <Integer> is needed because original stack class requires <T> type. 
		ArrayBoundedStack<Integer> stack = new ArrayBoundedStack<Integer>();
		Scanner input = new Scanner(System.in);
		int modulus; //the modulus after dividing on 2 will be this variable
		System.out.println("Please enter a decimal number:");
		int number = input.nextInt();

		
		while (number != 0) { //we always start from the number which is not a zero
			modulus = number%2;
			System.out.println("Remainder:" + modulus);
			stack.push(modulus);//pushing modulus (0 or 1) into stack. 
			number=number/2; //divide our number on 2 until we get 0
			System.out.println();
		
		}
		System.out.println("Binary:");
		while(!stack.isEmpty()) {
			
			System.out.print(stack.top());
			stack.pop(); //To print out directly pop() method is not possible because it`s void. 
			//So each time after popping I`ll just print out the top of the stack.
			
		}
	}

}
