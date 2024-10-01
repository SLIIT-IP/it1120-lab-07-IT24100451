import java.util.Scanner;
public class IT24100451Lab7Q3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=5;++i){
			System.out.println("Customer "+i);
			System.out.print("Enter the total bill amount :");
			int total=input.nextInt();
			System.out.print("Enter mode of payment(C for cash, O for other):");
			char mode=input.next().charAt(0);
			switch(mode){
				case 'C':
				case 'c':
					double discount=total*(5.0/100.0);
					System.out.println("Discount is :"+discount);
					double amount=total-discount;
					System.out.println("The amount to be paid :"+amount);
					break;
				case 'O':
				case 'o':
					System.out.println("No discount applicable");
					System.out.println("Amount to be paid :"+total);
					break;
				default:
					System.out.println("Payment mode is not valid");
			}
			System.out.println("\n");
		}
	}
}