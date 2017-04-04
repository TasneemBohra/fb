package facebook;

import java.util.Stack;

public class MakeParanthesisBalanced {
	public static void main(String[] args) {
		String str = ")(()";
		// base case 
		if (str.length() == 0) {
			System.out.println("Empty string");
			return;
		}
		Stack<Character> stack = new Stack<>();
		StringBuilder builder = new StringBuilder(str);
		for (int i = 0 ; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				stack.push(c);
			} else if (!stack.isEmpty() && stack.peek() == '(') stack.pop(); 
			else builder.insert(0, '(');
		}

		while (!stack.isEmpty()) {
			stack.pop();
			builder.append(')');
		}
		
		System.out.println(builder.toString());
	}
}
