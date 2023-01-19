package exercises;

public class Is_Lucky {
	/*
	Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

	Given a ticket number n, determine if it's lucky or not.
	
	Example
	
	For n = 1230, the output should be
	solution(n) = true;
	For n = 239017, the output should be
	solution(n) = false.
	*/
	
	boolean solution(int n) {
	    
        int sum1 = 0, sum2 = 0;
        int aux1 = 0, aux2 = 0;
        int length = String.valueOf(n).length();


        for(int i=0; i<length/2; i++){
            sum1 = sum1 + n % 10;
            n = n/10;
            aux1 = sum1;
        }

        
        for(int i=0; i<length/2; i++){
            sum2 = sum2 + n % 10;
            n = n/10;
            aux2 = sum2;
        }

        if(sum1 == sum2){
            return true;
        }else{
            return false;
        }
	}
}
