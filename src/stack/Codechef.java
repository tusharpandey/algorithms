package stack;

import util.Utility;

import java.lang.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Stack stack = new Stack();

		Utility.print("==================");
	    stack.push(10);
	    stack.push(11);
	    stack.push(12);
	    stack.push(13);
		Utility.print("");
		Utility.print("AFTER PUSH");
	    Utility.printArray(stack.getArray());

		Utility.print("");
		Utility.print("==================");
		stack.pop();
		stack.pop();
		Utility.print("");
	    Utility.print("AFTER POP");
		Utility.printArray(stack.getArray());
	}
}
