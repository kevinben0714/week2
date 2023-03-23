import java.util.*;
public class A1113343_0317_1
{
    public static void main(String[] argv) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a n:");
        int n = sc.nextInt();
        System.out.print("enter a m:");
        int m = sc.nextInt();

        int [][]arr = new int [n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[i][j] = (i+1)*(j+1);
                
        for(int []i:arr)
        {
            for(int j:i)
                System.out.print(j+"\t");
            System.out.println("");
            sc.close();
        }
    }
}