/*
Helen Li
April 29, 2019
*/

public class GenericDemo
{
	public static void main(String[] args)
	{
		GenericStack<String> stack1 = new GenericStack<String>();

		System.out.println("Testing Stack 1 (Strings)...\n");

		stack1.push("20 twenty");
		stack1.push("40 forty");

		stack1.displayStack();
		System.out.println();

		stack1.push("60 sixty");
		stack1.push("80 eighty");

		stack1.displayStack();
		System.out.println();

		stack1.pop();
		stack1.pop();

		stack1.displayStack();
		System.out.println();

		stack1.push("60 sixty");

		stack1.displayStack();
		System.out.println();

		GenericStack<Integer> stack2 = new GenericStack<Integer>();

		System.out.println("Testing Stack 2 (Integers)...\n");

		stack2.push(20);
		stack2.push(40);

		stack2.displayStack();
		System.out.println();

		stack2.push(60);
		stack2.push(80);

		stack2.displayStack();
		System.out.println();

		stack2.pop();
		stack2.pop();

		stack2.displayStack();
		System.out.println();

		stack2.push(60);

		stack2.displayStack();
		System.out.println();

		stack2.pop();
		stack2.push(80);

		stack2.displayStack();
	}
}
