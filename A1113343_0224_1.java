import java.util.Scanner;

public class A1113343_0224_1{
    public static void main(String[] args)
    {
        System.out.print("請輸入一個數");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.print("是偶數");
        }    
        if(a%2==1)
        {
            System.out.print("是奇數");
        }    
    }
}