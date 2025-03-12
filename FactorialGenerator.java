package recursion;




public class FactorialGenerator {
public double nthFactorial (int n) {
	return computeFactorialRecurse(n);
		
	}

private double computeFactorialRecurse(int n) {
	if(n <= 0){
		return 1;
	}else 
		return n * computeFactorialRecurse(n-1);
	
	}
public static void main(String[] args){
	FactorialGenerator obj  = new FactorialGenerator();
int n = 1;
for(int x=1; x<=32; x++) {
	double factorial =obj.nthFactorial(x);
	System.out.println(x + "! =" +factorial);
} 
}
}
