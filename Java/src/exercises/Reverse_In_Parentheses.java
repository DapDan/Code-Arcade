package exercises;

public class Reverse_In_Parentheses {
	/*
	Write a function that reverses characters in (possibly nested) parentheses in the input string.

	Input strings will always be well-formed with matching ()s.
	
	Example
	
	For inputString = "(bar)", the output should be
	solution(inputString) = "rab";
	For inputString = "foo(bar)baz", the output should be
	solution(inputString) = "foorabbaz";
	For inputString = "foo(bar)baz(blim)", the output should be
	solution(inputString) = "foorabbazmilb";
	For inputString = "foo(bar(baz))blim", the output should be
	solution(inputString) = "foobazrabblim".
	Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
	*/
	
	static StringBuilder str = new StringBuilder();

	String solution(String s) {
	    
	        for(int i = 0; i < s.length(); i++) {
	            if(s.toCharArray()[i] == ')') {
	                s = s.substring(0, i) + s.substring(i + 1);
	                i--;
	                String reversed = "";
	                while(s.toCharArray()[i] != '(') {
	                    reversed += s.toCharArray()[i];
	                    s = s.substring(0, i) + s.substring(i + 1);
	                    i --;
	                }
	                s = s.substring(0, i) + reversed + s.substring(i + 1);
	                i += reversed.length() - 1;
	            }
	        }
	        return s;
	}
}
