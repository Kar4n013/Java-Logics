package q1;

//Replace all 0's with 1 in given Integer

public class Replace_zero {
	public static void main(String[] args) {

		int n1 = 20402010;
		System.out.println("Before operation: " + n1);
		int n2 = n1;
		String result = "";
		while (n2 > 0) {
			if (n2 % 10 == 0) {
				result = 1+result;
			} else {
				result = n2 % 10 + result;
			}
			n2 /= 10;
		}
		
		System.out.println("After operation: "+result);
	}
}