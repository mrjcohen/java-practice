package day47_blocks;

import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.Arrays;
import static java.time.LocalDateTime.now;

public class StaticImports {
	public static void main(String[] args) {
		
//import static java.lang.Math.*;
		
		//Math class imported statically so they can be called directly
		System.out.println(PI);
		System.out.println(max(10,5));
		System.out.println(max(5,5));
		System.out.println(min(10,100));
		System.out.println(floor(3.45));
		System.out.println(round(45.99));
		System.out.println(round(15.5));
		System.out.println(abs(-10));
		System.out.println(pow(10.4,2));
		System.out.println(sqrt(5));
		System.out.println(random() * 100);
		
//===============================================
		
//import static java.lang.Character.*;
		
		//Character class imported statically so they can be called directly
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('A'));
		
//===============================================
		
//import static java.util.Arrays.sort;
		//sort method imported statically so it can be called direclty
		int[] nums = {34, 23, 44, 11, 4444, 1222};
		sort(nums);
		System.out.println(Arrays.toString(nums));
		
//===============================================
		
		//import static java.util.Arrays.sort;
				//LocalDateTime.now method imported statically so it can be called direclty	
		
		System.out.println(now());
		
		
		
		
		
		
		
		
	}
}
 