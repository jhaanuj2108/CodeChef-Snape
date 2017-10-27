import java.util.Scanner;
class SNAPE 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			int b = sc.nextInt();
			int ls = sc.nextInt();
			double rsmin = Math.sqrt(ls*ls - b*b);
            double rsmax = Math.sqrt(ls*ls + b*b);
		System.out.println(rsmin+" "+rsmax);
		}
	}
} 
