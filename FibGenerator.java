package recursion;

public class FibGenerator {
public int nthFib(int n) {
	return computeFibRecurse(n);
}
private int computeFibRecurse(int n) {
	if(n<=2){
		return 1;
	} else {
	int first = computeFibRecurse(n-1);
	int second = computeFibRecurse(n-2);
	return first + second; 
	}
}
	public static void main(String[] args){
	int n=1;
		System.out.println("STARTING");
		FibGenerator obj  = new FibGenerator();
		for(int x=1; x<=40; x++) {
			int fib = obj.nthFib(x);
		System.out.println("fib("+x+"=)"+fib);
		}
	}
}