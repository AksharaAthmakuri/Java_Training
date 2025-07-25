
public class Task52 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length>0)
		{
			String input=args[0];
			String rev="";
			for(int i=input.length()-1;i>=0;i--)
			{
				rev+=input.charAt(i);
			}
			System.out.println(" reversed:"+rev);
		}
		else
		{
			System.out.println("please provide as comdline arg");
		}
	}

}
