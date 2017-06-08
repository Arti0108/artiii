import java.util.Scanner;

public class BallotUI {
	
	 private Candidate candidate1;
	 
	    private Candidate candidate2;

	    private Candidate candidate3;

	    private Candidate candidate4;
	    private Candidate winner;
        
	
	private Scanner keyboard;
	
		    private BallotManager ballot;
		    private String votingMessage;
	
		 
	
		    public BallotUI()
	
		    {
	
		        keyboard = new Scanner(System.in);
	
		    }
	
		 
	
		    public void menu()   
	
		    {
	
		        int command = -1;
	
		        while(command != 0)       
	
		        {
	
		            displayMainMenu();
	
		            command = getCommand();
	
		            execute(command);
	
		        }
	
		    }
	
	 
	
		    private void displayMainMenu()
	
		    {
	
		        System.out.println("Options are");
	
	            System.out.println("    To vote for siya          Enter 1");
	
		        System.out.println("    To vote for niya          Enter 2");
	
		        System.out.println("    To vote for jiya           Enter 3");
	
		        System.out.println("    To vote for piya          Enter 4");
	
		        System.out.println("To close    Enter 0");
	
		    }
	
		
	
		    private void execute(int command)
	
		    {
	
		        if(command == 1)
	
		        {
	
		        	candidate1.incrementVoteCount();
	
		        }
	
		        else if(command == 2)
	
		        {
	
		            candidate2.incrementVoteCount();
	
		        }
	
		        else if(command == 3)
	
		        {
	
		            candidate3.incrementVoteCount();
	
		        }
	
	         else if(command == 4)
	
		        {
	
		            candidate4.incrementVoteCount();
	
		        }           
	
	         else if(command == 0)
	
		        {
	
		            System.out.println(" Program closing down");
	
		        }
	
		        else
	
		        {
	
		            System.out.println("Unknown command");
	
		            ballot.castVote(2);
	
		        }
	
 
	
		    }
	
		 
		    private int getCommand()
	
		    {
	
	        System.out.print("Enter command: ");
	
		        return keyboard.nextInt();
	
		    }
	
		 
	

}
