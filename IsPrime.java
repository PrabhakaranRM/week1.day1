package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=23;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				System.out.println("Not Prime number");
			}
			else {
				System.out.println("Prime number");
			}
		}

	}

}
