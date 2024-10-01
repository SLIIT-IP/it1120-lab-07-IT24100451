import java.util.Scanner;
public class IT24100451Lab7Q1B{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		for (int i=1;i<= 3; i++){
			System.out.println("Student "+i);
			System.out.print("Enter marks :");
			String[] mark=input.nextLine().split(" ");
			int mark1=Integer.parseInt(mark[0]);
			int mark2=Integer.parseInt(mark[1]);
		 	int mark3=Integer.parseInt(mark[2]);
			int mark4=Integer.parseInt(mark[3]);
			double avg=(mark1+mark2+mark3+mark4)/4.0;
			System.out.println("Average is :"+avg);
			String grade;
			if(avg>75){
				grade="Distinction";
			}
			else if(avg>50){
				grade="Credit";
			}
			else {
				grade="Fail";
			}
			System.out.println("The overall Grade is: "+grade);
		}
	}
}