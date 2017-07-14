public class Calculate{
	public int plus(int a, int b){
		return a + b;
	}
	public int minus(int a , int b ){
		return a - b;
	}
	public int multiply(int a , int b){
		return a * b;
	}
	public int divide(int a , int b){
		if(b != 0){
			return a / b;
		}
		else{
			return -1;
		}
	}
}

class runner{
	public static void main(String[] args){
		int a = 10 , b = 2;
		Calculate c = new Calculate();
		System.out.println(c.plus(a,b));
		System.out.println(c.minus(a,b));
		System.out.println(c.multiply(a,b));
		System.out.println(c.divide(a,b));
	}
}
