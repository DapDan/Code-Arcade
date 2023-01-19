package exercises;

public class Check_Palindrome {
	/*
	Given the string, check if it is a palindrome.

	Example

	For inputString = "aabaa", the output should be
	solution(inputString) = true;
	For inputString = "abac", the output should be
	solution(inputString) = false;
	For inputString = "a", the output should be
	solution(inputString) = true.
	*/
	
	boolean solution(String inputString) {
	    String reverseString = new StringBuilder(inputString).reverse().toString();
	    if(inputString.equals(reverseString)){
	        return true;
	    }
	    else{
	        return false;
	    }
	}

}
