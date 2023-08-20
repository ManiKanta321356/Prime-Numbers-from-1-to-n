import java.util.Scanner;
class PrimeNumnersFrom1toN 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i=2;i<N;i++)
		{
			boolean flag = true;
			for (int j=2;j<i;j++)
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				System.out.println(i +" ");
			}

		}
	}
}
