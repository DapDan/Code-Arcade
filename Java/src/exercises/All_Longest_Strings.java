package exercises;

import java.util.ArrayList;
import java.util.List;

public class All_Longest_Strings {
	/*
	Given an array of strings, return another array containing all of its longest strings.
	
	Example
	
	For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
	solution(inputArray) = ["aba", "vcd", "aba"].
	*/
	
	String[] solution(String[] inputArray) {
        List<String> lista = new ArrayList<String>();
        String auxS = "";
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i].length() >= auxS.length()){
                lista.add(inputArray[i]);
                auxS = inputArray[i];
            }
        }
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i].length() != auxS.length()){
                lista.remove(inputArray[i]);
            }
        }
        
        String[] str = lista.toArray(new String[lista.size()]);
        return str;
	}

}
