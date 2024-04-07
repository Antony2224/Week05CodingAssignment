
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates a logger that implements the methods created in AsteriskLogger class
		Logger logger =new AsteriskLogger();
		//Implements the log method from the class AsteriskLogger
		logger.log("Fire!!");
		//Printed line for more readable console
		System.out.println("---------------");
		//Implements the error method from the class AsteriskLogger
		logger.error("Hello");
		
		//New logger that call in the SpacedLogger class
		Logger logger1 = new SpacedLogger();
		//code for more readable console
		System.out.println("----------");
		//implements the log method from the class SpacedLogger
		logger1.log("Lake");
		System.out.println();
		//implements the error method from the class SpacedLogger
		logger1.error("Honey");
	}

}
