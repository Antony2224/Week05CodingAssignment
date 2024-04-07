
public class SpacedLogger implements Logger {
	//Overwritten method from Logger interface
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		//For loop that separates and prints the characters of the String log
		for (int index =0; index<log.length(); index++) {
			System.out.print(log.charAt(index) + " ");
		}
	}
	//Overwritten method from Logger interface
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.print("ERROR:");
		//For loop that separates and prints the characters of the String error
		for (int index =0; index<error.length(); index++) {
			System.out.print(error.charAt(index) + " ");
		}	
	}
}
