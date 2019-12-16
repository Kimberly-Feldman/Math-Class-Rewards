//calculates the average of numbers entered, enter non-number to end scan and calculate

import java.util.*;

public class averages {

	public static void main(String args[]) {
		
		System.out.println("Enter your numbers: ");
		Scanner inputScan = new Scanner(System.in);
		
		Stack<Double> numbers = new Stack<>();
		
		
		while(inputScan.hasNextDouble()) {
			numbers.push(inputScan.nextDouble());
			
		}
		
		if(inputScan.hasNext()) {
			inputScan.close();
		}
		
		double totalNum = 0;
		int size = numbers.size();
		while(!(numbers.isEmpty())) {
			totalNum = totalNum + numbers.pop();
		}
		double mean = (totalNum/size);
		
		//this section fixes the rounding error from 1.1,2.2,3.3
		double adjustor = 1000000.0;
		mean = (Math.round(mean * adjustor)/adjustor);
		
		System.out.println("Results!");
		System.out.println("Number of entries: " + size);
		System.out.println("Total of all entries: " + totalNum);
		System.out.println("The average is: " + mean);
		
	}
	
}
