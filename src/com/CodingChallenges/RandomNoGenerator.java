//Random Values within the range of 100 to 200
package com.CodingChallenges;

import java.util.*;

public class RandomNoGenerator {

	public static void main(String[] args) {
		
		int count = 0;
		 
		Random objGenerator = new Random();
		
        while(true){
          
        	 int randomNumber = objGenerator.nextInt(200);
        	 
        	 if((randomNumber>=100)&&(randomNumber<=200))
        	 {
        		 System.out.println("Random No : " + randomNumber); 
        		 count++;
        	 }
        	 if(count>=20)
        	 {
        		 break;
        	 }
        }
        System.out.println(count);
	}
}
