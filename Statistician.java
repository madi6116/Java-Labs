package bubble;

import java.util.*;


public class Statistician 
{
	private final static int N_REPETITIONS = 1000;
	
	
	
	private static int[] buildRandom(int length, int maxValue)
	{
		int[] array = new int[length];
		for (int i=0; i<length; i++)
			array[i] = (int)(Math.random()*(maxValue + 1));
		return array;
	}
	
	private static boolean isSorted(int[] a) {
		for(int i=0;i<a.length-2;i++) {
			if(a[i]>a[i+1]) {return false;}
		}
		return true;
	}
	
	private static void getStats(int arrayLength)
	{
		ArrayList<Long> visitCounts = new ArrayList<>();
		ArrayList<Long> swapCounts = new ArrayList<>();
		
		for (int i=0; i<N_REPETITIONS; i++)
		{
			int[] array = buildRandom(arrayLength, arrayLength*100);
			BubbleSorter sorter = new BubbleSorter(array);
			sorter.sort();
			assert(isSorted(array)==true);
			visitCounts.add(sorter.getNVisits());
			swapCounts.add(sorter.getNSwaps());

		}
		System.out.println("Visits:");
		Long num = (long) 0;
	    int sum = 0;
	    int avg = 0;
	    Long min = (long) 0;
	    Long max = (long) 0;
	    int i = 0;
	   
	    for (i = 0; i < 3; ++i){
	        num = visitCounts.get(i);
	        sum += num;
	        if(num > max){
	            max = num;
	        }
	        if(num < min){
	            min = num;
	        }
	    }
	    avg = sum / i;
	    System.out.println("Sum: " + sum);
	    System.out.println("Avg: " + avg);
	    System.out.println("Max: " + max);
	    System.out.println("Min: " + min);
	
	
	System.out.println("Swaps:");
	    Long num1 = (long) 0;
	    int sum1 = 0;
	    int avg1 = 0;
	    Long min1 = (long) 0;
	    Long max1= (long) 0;
	    int j = 0;
	   
	    for (j = 0; j < 3; ++j){
	        num1 = swapCounts.get(j);
	        sum1 += num1;
	        if(num1 > max1){
	            max1 = num1;
	        }
	        if(num1 < min1){
	            min1 = num1;
	        }
	    }
	    avg1 = sum1 / j;
	    System.out.println("Sum: " + sum1);
	    System.out.println("Avg: " + avg1);
	    System.out.println("Max: " + max1);
	    System.out.println("Min: " + min1);
	}
	
	
	public static void main(String[] args)
	{
		int[] tiny = {1,24,5,25};
		int[] alreadySorted = {1,5,24,25};
		int[] backward = {25,24,5,1};
		System.out.println("Tiny");
		BubbleSorter tinySorted = new BubbleSorter(tiny);
		tinySorted.sort();
		System.out.println(tinySorted);
		
		System.out.println("Already Sorted");
		BubbleSorter already = new BubbleSorter(alreadySorted);
		already.sort();
		System.out.println(already);
		
		System.out.println("Backward");
		BubbleSorter back = new BubbleSorter(backward);
		back.sort();
		System.out.println(back);
	
        System.out.println("1000:");
        getStats(1000);
        
		System.out.println("3000:");
		getStats(3000);
		
	}
}
