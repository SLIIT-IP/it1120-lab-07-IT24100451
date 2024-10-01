import java.util.Scanner;
public class IT24100451Lab7Q1A{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		int[] num=new int[4];
		int count=0;
		double avg=0.0;
		int total=0;
		while (count<4){
			System.out.print("Enter the subject mark"+(count+1)+":");
			num[count]=input.nextInt();
			count++;
		}
		count=0;
		while(count<4){
			total=total+num[count];
			count++;
		}
		avg=(double)total/4;
		System.out.println("The Average mark is: "+avg);
		if (avg>75) {
			System.out.println("Overall Grade is : Distinction");
		}
		else if (avg>50) {
			System.out.println("Overall Grade is : Credit");
		}
		else  {
			System.out.println("Overall Grade is : Fail");
		}
	}
}