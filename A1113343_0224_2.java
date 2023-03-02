import java.util.Scanner;
	public class A1113343_0224_2 {
		public static void main (String [] argv) {
		int c,f;
		System.out.printf("enter a Celsius temperature");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		f = (c*9/5)+32;
		System.out.printf("Convert to Fahrenheit as%d",f);
	}
}