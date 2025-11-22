package loan;
import javax.swing.JOptionPane;
public class Loan {

	public static void main(String[] args) {
		Double income;
		Double yearJob;
		String input;
		
		//get user's icome
		input = JOptionPane.showInputDialog("How many do you earn a year?");
		income = Double.parseDouble(input);
		
		// get user's year Job
		input = JOptionPane.showInputDialog("How many year do you work in this company ?");
		yearJob = Double.parseDouble(input);
		
		// condition earning a loan
		if (income >= 3000) 
		{
			if (yearJob >= 2.0) 
			{
				JOptionPane.showMessageDialog(null, "congratulation you qualify for a loan");
			}
			else {
				JOptionPane.showMessageDialog(null, "you may need working in the company"+ " "
						+ "at leat two years");
		}
		}
		else {
				JOptionPane.showMessageDialog(null, "unfortunately you are not qualify for a loan");	
			
			
				
				
		System.exit(0);
			}
			}
	}


