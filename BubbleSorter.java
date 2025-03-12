package bubble;

public class BubbleSorter 
{
	private int[]		a;
	private long		nVisits;
	private long		nSwaps;
	
	
	public BubbleSorter(int[] a)
	{
		this.a = a; 
	}
	
	
	public void sort()
	{
		nVisits = 0;
		nSwaps = 0;
		for (int i = 0; i < a.length; i++) {
			int minIndex = i;
			nVisits++;
			for (int j = i+1; j < a.length; j++) {
				
				if (a[j] < a[minIndex]) {
					
					minIndex = j;
					nSwaps++;
				}
			
				if(nSwaps == 0) {
					break;
				}
			}
			if (i != minIndex) {
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}


	}
	
	
	public String toString()
	{
		String s = nVisits + " visits, " + nSwaps + " swaps\n{";
		for (int n: a)
			s += " " + n;
		s += " }";
		return s;
	}
	
	public long getNVisits()
	{
		return nVisits;
	}
	
	
	public long getNSwaps()
	{
		return nSwaps;
	}
	
	
	public int[] getArray()
	{
		return a;
	}
	
	
	
}
