package exercises;

import java.util.ArrayList;
import java.util.List;

public class Add_Border {
/*
	Given a rectangular matrix of characters, add a border of asterisks(*) to it.
	
	Example
	
	For
	
	picture = ["abc",
	           "ded"]
	the output should be
	
	solution(picture) = ["*****",
	                      "*abc*",
	                      "*ded*",
	                      "*****"]
	*/
	
	String[] solution(String[] picture) {
		List<String> list = new ArrayList<String>();
		String ch = "";
        int aux = 0;
		
		for(int i=0; i<picture[0].length()+2;i++) {
			ch += "*";
		}
		list.add(ch);
		
		for(int i=0; i<picture.length;i++) {
			list.add('*'+picture[i]+'*');
		}
			
		for(int i=0; i<=picture.length-1000; i++) {
			ch += "*";
		}
		list.add(ch);
	
        return list.toArray(new String[list.size()]);
		
}

}
