package q2;

//Find number if times a digit occurs in given input
public class Findx {
	public static void main(String[] args) {
		int n1 = 976986979, count = 0,target = 9,n2 = n1;
		while (n2 > 0) {
			if(n2%10 == target) {
				count++;
			}
			n2 /= 10;
		}
		System.out.println(target+" is repeated "+count+" times in given input "+n1);
	}
}
