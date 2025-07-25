package javaoops_polymorphism;
interface Logger{
	default void logInfo()
	{
		System.out.println("default info log");
	}
	static void logError()
	{
		System.out.println("static error log");
	}
}
public class AppLogger implements Logger {
	public static void main(String[] args) {
		AppLogger app=new AppLogger();
		app.logInfo();
		Logger.logError();
	}
}
