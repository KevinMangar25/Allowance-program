package proj3;
import java.util.Scanner;



public class Project4App {
	public static void main(String [] args) {
		//scanner instantiated
		Scanner scan = new Scanner(System.in);
		
		//count variables
		int count = 0;
		int addCorrect = 0;
		int addWrong = 0;
		int subCorrect = 0;
		int subWrong = 0;
		double percentCorrect = 0;
		for(int i = 0; i < 10; i++) {
			Question str = new Question();
			System.out.println("What is the result? ");
			System.out.println(str.toString());
			int answer = scan.nextInt();
			count += 1;
			// checking if the user got the question right
			if(answer == str.determineAnswer()) {
				System.out.println("Congratulations, you got it correct!");
				//if the operator is + add 1 to addCorrect
				if(str.getOperator() == '+') {
					addCorrect++;
				}
				//else the operator is - and add 1 to subCorrect
				else {
					subCorrect++;
				}
			}
			else {
				System.out.println("The correct answer for " + str.toString() + "is " + str.determineAnswer());
				// if the operator is + add 1 to addWrong
				if(str.getOperator() == '+') {
					addWrong++;
				}
				// else the operator is - and add 1 to subWrong
				else {
					subWrong++;
				}
			}
			
		}
		percentCorrect = ((double)(addCorrect + subCorrect) / count) * 100;
		double temp = percentCorrect;
		
		while(percentCorrect < 85.0 && count < 20) {
			
				Question str = new Question();
				System.out.println("What is the result? ");
				System.out.println(str.toString());
				int answer = scan.nextInt();
				count += 1;
				// checking if the user got the question right
				if(answer == str.determineAnswer()) {
					System.out.println("Congratulations, you got it correct!");
					//if the operator is + add 1 to addCorrect
					if(str.getOperator() == '+') {
						addCorrect++;
					}
					//else the operator is - and add 1 to subCorrect
					else {
						subCorrect++;
					}
				}
				else {
					System.out.println("The correct answer for " + str.toString() + "is " + str.determineAnswer());
					// if the operator is + add 1 to addWrong
					if(str.getOperator() == '+') {
						addWrong++;
					}
					// else the operator is - and add 1 to subWrong
					else {
						subWrong++;
					}
				}
				percentCorrect = ((double)(addCorrect + subCorrect) / count) * 100;
				
			
			
		}
		
		double roundedPercent = Math.round(percentCorrect);
		System.out.println("Progress Report: ");
		System.out.println("Addition: \nYou got " + addCorrect + " correct and " + addWrong + " incorrect.");
		System.out.println("Subtraction: \nYou got " + subCorrect + " correct and " + subWrong + " incorrect. ");
		System.out.println("The percent correct is " + roundedPercent + "%");
	

	}
}
