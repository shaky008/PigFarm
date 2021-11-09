package comp1130;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Farmer {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Create two different types of feed: apple and potato
		int appleBins = 0;
		int potatoBins = 0;

		//Create 3 different pigs
		Pig pg=new Pig ("Keanu Reeves", "pink", "male", dateofBirth_d(05, 04, 02)); //YY,MM,DD
		Pig pg2=new Pig ("Tommy", "Green", "male", dateofBirth_d(02, 03, 07));
		Pig pg3=new Pig ("Scarlett", "Yellow", "Female", dateofBirth_d(01, 01, 07));
		
		//Create a user input loop that asks the farmer to enter no of bins they have, ask Y/N to feed the pigs,
		//if Yes, feed the pigs
		Scanner sc1 = new Scanner (System.in);
		
		String verify = "Y";
		while(verify.equals("Y")||verify.equals("y"))
		{			
			 System.out.println("How many new bins of Apple do you have?");
	            appleBins = sc.nextInt();
	            Feed fd =new Feed("Apple",appleBins);

	            System.out.println("How many new bins of Potato do you have?");
	            potatoBins =sc.nextInt();
	            Feed fd1 = new Feed("Potato",potatoBins);

	            System.out.println("Do you want to feed the pigs?(Y/N)");
	            String fdpg; 
	            fdpg = sc.next();
	            if (fdpg.equals("Y")||fdpg.equals("y")){
	                Feed.consume();
					System.out.println(pg.getName() +", " + pg2.getName() + " and " + pg3.getName() + " ate " +fd1.getFeedName() + " and " + fd.getFeedName());
	      }
	            else{
	                System.out.println("The pigs will not be fed.");
	            }

	            System.out.println("would you like to go again?? ");
	            verify =sc.next();}

	}
	private static Date dateofBirth_d(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

}
