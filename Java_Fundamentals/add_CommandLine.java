
public class Task51 {

	public static void main(String[] args)
	{
	if(args.length<2)
	{
	System.out.println("please provide two numbers");
	return;

	}
	try
	{
	String s1=args[0];
	String s2=args[1];
	int n1=Integer.parseInt(s1);
	int n2=Integer.parseInt(s2);
	int sum=n1+n2;
	System.out.println(sum);
	}
	catch (NumberFormatException e)
	{
	System.out.println("invalid ");
	}
	}
	}



