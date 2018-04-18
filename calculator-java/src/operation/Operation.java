package operation;

public class Operation {
	
	public double soma(double number1, double number2) {
		double result = number1+number2;
		return result;
	}

	public double sub(double number1, double number2) {
		double result = number1-number2;
		return result;
	}
	
	public double mult(double number1, double number2) {
		double result = number1*number2;
		return result;
	}
	
	public double div(double number1, double number2) {
		double result = number1/number2;
		return result;
	}
	
	public double raiz(double number1) {
		double result = Math.sqrt(number1);
		return result;
	}
	

}
