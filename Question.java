package proj3;
import java.util.Random;

/**
 * Name: public class
 * Description: Declares the private variables
 */

public class Question {
	private int operand1;
	private int operand2;
	private char operator;
	
	/**
	 * Name: getOperand1
	 * Description: returns operand1
	 * @return operand1
	 */
	
	public int getOperand1() {
		return operand1;

	}
	
	/**
	 * Name: getOperand2
	 * Description: returns operand2
	 * @return operand2
	 */
	
	public int getOperand2() {
		return operand2;
	}
	
	/**
	 * Name: getOperator
	 * Description: returns operator
	 * @return operator
	 */
	
	public char getOperator() {
		return operator;
	}
	
	/**
	 * Name: Default constructor
	 * Description: assigns the private instance variables to random numbers
	 */
	
	public Question() {
		Random rand;
		rand = new Random();
		int randomOperator = rand.nextInt(2);
		
		if(randomOperator == 0) {
			operator = '+';
			operand1 = rand.nextInt(13);
			operand2 = rand.nextInt(13);
		}
		else { 
			operator = '-';
			operand1 = rand.nextInt(7) + 6;
			operand2 = rand.nextInt(operand1 + 1);
		}
		
	}
	
	/**
	 * Name: toString
	 * Description: returns a string with the operand1, operand2 and operator
	 * @return a string
	 */
	
	public String toString() {
		return operand1 + " " + operator + " " + operand2 + " = ";
	}
	
	/**
	 * Name: determineAnswer
	 * Description: Checks to see the operator sign and then does the math for the operator assigned
	 * @return operand1 + operand2, or else operand1 - operand2
	 */
	
	public int determineAnswer() {
		if(operator == '+') {
			return operand1 + operand2;
		}
		else {
			return operand1 - operand2;
		}
	}

}

