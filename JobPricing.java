import java.util.Scanner;

public class JobPricing
{
	public static void main(String[] args)
	{

		// Variables and constants
		String job;
		double materials;
		double hrsTraveled;
		double hrsWorked;
		double estPrice;

		//objects
		Scanner input = new Scanner(System.in);

		//input phase
		System.out.print("Enter the name of Job? >> ");
		job = input.nextLine();

		System.out.print("Cost of materials? >> ");
		materials = input.nextDouble();

		System.out.print("Hours worked? >> ");
 		hrsWorked = input.nextDouble();

		System.out.print("Number of hours traveled? >> ");
		hrsTraveled = input.nextDouble();
 

		 //calculation phase
		estPrice = addCal(materials, hrsWorked, hrsTraveled);
		

		//output phase
		System.out.println("Your job name for " + job + ", estimated price is " + estPrice);

		}

		public static double addCal(double m, double hW, double hT)
		{

			hW = hW * 35.0;
			hT = hT * 12.0;
			
			double estPrice;
			estPrice = m + hW + hT;
			return estPrice;

		}
	}





