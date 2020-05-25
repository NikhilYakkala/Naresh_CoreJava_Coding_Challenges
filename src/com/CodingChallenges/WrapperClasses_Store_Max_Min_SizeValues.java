//Task: Wrapper Classes Max, Min and Size Values for byte,long,short and int.
package com.CodingChallenges;

import java.lang.*;

public class WrapperClasses_Store_Max_Min_SizeValues {
	
	public static void main(String[] args) {
		
		byte b_min_value = Byte.MIN_VALUE;
		
		byte b_max_value = Byte.MAX_VALUE;
		
		byte byte_size = Byte.SIZE;
		
System.out.println("Byte Min Value: "+Byte.MIN_VALUE+"\n"+"Byte Max Value: "+Byte.MAX_VALUE+"\n"+"Byte Size in Bits: "+Byte.SIZE);
		
System.out.println("Short Min Value: "+Short.MIN_VALUE+"\n"+"Short Max Value: "+Short.MAX_VALUE+"\n"+"Short Size in Bits: "+Short.SIZE);

System.out.println("Long Min Value: "+Long.MIN_VALUE+"Long Max Value: "+Long.MAX_VALUE+"Long Size in Bits: "+Long.SIZE);

System.out.println("Int Min Value: "+Integer.MIN_VALUE+"Int Max Value: "+Integer.MAX_VALUE+"Byte Size in Bits: "+Integer.SIZE);

	}

}
