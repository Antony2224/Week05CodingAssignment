//Class that calls in the Logger methods and creates new methods that are class specific
public class AsteriskLogger implements Logger{
	//Overwritten method from Logger interface
	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}
	//Overwritten method from Logger interface
	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("****************");
		System.out.println("***Error:" + error +"***");
		System.out.println("****************");
	}
	
}
