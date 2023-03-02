import java.util.Scanner;

	public class A1113343_0224_1 {
		public static void main (String[] args) {
			int a;
			System.out.printf("請輸入一個數");
				Scanner sc = new Scanner(System.in);
			a = sc.nextlnt();
		if(a%2==0)
		{
			System.out.printf("是偶數");
		}		
		if(a%2==1)
		{
			System.out.printf("是奇數");	
		}
	}
}