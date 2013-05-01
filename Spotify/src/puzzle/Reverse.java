package puzzle;

import java.util.Scanner;
import java.util.Stack;


/**
 * 
 * @author Brian Bourn
 * @email ba.bourn@gmail.com
 *
 */
public class Reverse {

	public static void main(String[] args) {
		//collect the integer
		System.out.print("Welcome to My Spotify Puzzle solution \n" +
							"to exit please input a negative number. \n" +
							"Integer: ");
				
		Scanner fred = new Scanner(System.in);
		int input = fred.nextInt();
		
		while(input >=0){
			Stack<Integer> reverse = new Stack<Integer>();
			//convert to binary and push to stack
			while(input != 0)
			{
				reverse.push(input % 2);
				input = input / 2;
			}
			int revNum = 0;
			int pow = 0;
			int value = 0;
			//pop from stack then convert to decimal
			while(!reverse.empty())
			{
				value = reverse.pop();
				if(value == 1)
				{
					revNum += Math.pow(2, pow);
				}
				pow++;
			}
			System.out.print(revNum+"\nNext Integer:");
			
			input = fred.nextInt();
		}

	}

}
