import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ITSupportSystemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//This is the support request queue linked list
		Queue<ITSupportRequests> supportRequests = new LinkedList<>();
		
		ITSupportRequests Request1 = new ITSupportRequests("Warren", "Problem with a monitor");//creating an ITSupportRequests object from ITSupportRequests 
		supportRequests.add(Request1);
		
		ITSupportRequests Request2 = new ITSupportRequests("Brandon", "Problem with hard drive");
		supportRequests.add(Request2);
		////////////////////////////////////////////////////////
		
		int userChoice;

		do{

		
		userChoice = ITSupportSystemMenu();
		switch (userChoice) {
		
		 case 1: System.out.println("----------Add IT support Ticket--------------");
		 		//Adding a IT support Ticket 
		 		System.out.println("Enter your name"); 
		 		String newRequestName = input.next();
		 		
		 		System.out.println("Enter your tech problem:");
		 		String techproblemResponse = input.next();
		 		
		 		ITSupportRequests temp = new ITSupportRequests(newRequestName, techproblemResponse);
		 		
		 		supportRequests.add(temp);//adds support request to supportRequests linkedlist at the end of the queue
		 		
		 		break;
		 		
		 case 2: System.out.println("--------Fixing IT Support Ticket");
		 		
		 		System.out.println("Loading in Support Ticket");
		 		ITSupportRequests request = supportRequests.peek(); //assigns the first item in the queue as a element for accessing
		 		
		 		System.out.println(request);
		 		
		 		System.out.println("Is the problem fixed? Enter yes if not enter a no");

		 		String iTSupportCheck = input.next();
		 		
		 			if(iTSupportCheck.equals("yes")) {
		 				System.out.println("The support Ticket in use is now marked as fixed");
					 	supportRequests.poll();//removes the ticket from the queue

		 			}
					if(iTSupportCheck.equals("no")){
					System.out.println("The support Ticket has not been fixed, sending back to the top of the queue");

					}
		 		break;
		
		 case 3:System.out.println("----Viewing next IT Support Ticket");
				 ITSupportRequests view = supportRequests.peek();//shows next IT support ticket in the queue

				 System.out.println(view);
				 break;

		 case 4: System.out.println("----Closing IT Support System----");
				 System.exit(0);
				break;

		}
	}while(userChoice != 4);
		
		
	}

	
	////////////////////////////////////////////////////////
	static int ITSupportSystemMenu() {
		
		int menuInput = 0;
		boolean invalidChoice;
		Scanner menuScanner = new Scanner(System.in);
		
		
		do {
			System.out.println("---------IT Support System-----------");
			System.out.println("Input the number for the desired function");
			System.out.println("1. Add IT Support Ticket");
			System.out.println("2. Fix IT Support Ticket");
			System.out.println("3. View IT Support Ticket");
			System.out.println("4. Close IT Support System");
			
			System.out.println("Choice (1-4):");
			menuInput = menuScanner.nextInt();
			
			invalidChoice = (menuInput < 1 || menuInput > 4);
			
			if(invalidChoice){
				System.out.println("Invalid input please again");
				
			}
			
		}while(invalidChoice);
		
		
		
		
		return menuInput;
		
		
		
	}
		
	
	
}
