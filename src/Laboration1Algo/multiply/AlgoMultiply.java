package algo.multiply;

import java.util.*;

import algo.util.NumberCreator;
import algo.util.StopWatch;
/**
 * Invokes algorithms with different size and type of data structure.
 */
public class AlgoMultiply {
	/**
	 * Program entry point. Invokes algorithms with different size 
	 * and type of data structure.
	 * @param args not used.
	 */
	public static void main(String[] args) {
		Multiplier multiplier = new Multiplier();
		StopWatch stopWatch = new StopWatch();
		List<Integer> dataStructure;
		int[] numberOfElements;
		long time;

		//warming up
		System.out.println("Warming up ...");
		multiplier.multiplyAll(new ArrayList<>(NumberCreator.createNumberList(8000, 0, 9, false)));

		/* 
		 * Testing the method multiplyAll with different number of elements
		 * using the data structure ArrayList. 
		 */		
		numberOfElements = new int[] {40000, 80000, 120000, 160000, 200000};
		
		for(int i = 0; i < numberOfElements.length; i ++) {	
			dataStructure = new ArrayList<>(NumberCreator.createNumberList(numberOfElements[i], 0, 9, false));
			stopWatch.start();		
			multiplier.multiplyAll(dataStructure);
			time = stopWatch.stop();		
			System.out.println("Multiply all with " + numberOfElements[i] + " elements in ArrayList. Time: " + time);
		}	
		
		/* 
		 * Testing the method multiplyAll with different number of elements
		 * using the data structure LinkedList. 
		 */		
		numberOfElements = new int[] {1000, 1500, 2000, 2500, 3000};
		
		for(int i = 0; i < numberOfElements.length; i ++) {	
			dataStructure = new LinkedList<>(NumberCreator.createNumberList(numberOfElements[i], 0, 9, false));
			stopWatch.start();		
			multiplier.multiplyAll(dataStructure);
			time = stopWatch.stop();		
			System.out.println("Multiply all with " + numberOfElements[i] + " elements in LinkedList. Time: " + time);
		}	
		
		/* 
		 * Testing the method multiplySome with different number of elements
		 * using the data structure ArrayList. 
		 */	
		numberOfElements = new int[] {300000000, 350000000, 400000000, 450000000, 500000000};
		
		for(int i = 0; i < numberOfElements.length; i ++) {	
			dataStructure = new ArrayList<>(NumberCreator.createNumberList(numberOfElements[i], 0, 9, false));
			stopWatch.start();		
			multiplier.multiplySome(dataStructure);
			time = stopWatch.stop();		
			System.out.println("Multiply some with " + numberOfElements[i] + " elements in ArrayList. Time: " + time);
		}	
	
		/* 
		 * Testing the method multiplySome with different number of elements
		 * using the data structure LinkedList. 
		 */			
		numberOfElements = new int[] {50000, 100000, 150000, 200000, 250000};
		
		for(int i = 0; i < numberOfElements.length; i ++) {	
			dataStructure = new LinkedList<>(NumberCreator.createNumberList(numberOfElements[i], 0, 9, false));
			stopWatch.start();		
			multiplier.multiplySome(dataStructure);
			time = stopWatch.stop();		
			System.out.println("Multiply some with " + numberOfElements[i] + " elements in LinkedList. Time: " + time);
		}		
	}
}