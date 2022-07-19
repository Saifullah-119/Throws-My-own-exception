class AgeException extends Exception
{
	private int info;
	AgeException(int b)
	{
		info=b;
	}
	public String toString()
	{
		return "AgeException["+info+"]";
	}
}
class Throwww
{
	static void age(int a) throws AgeException
	{
		if(a<18)
			throw new AgeException(a);
		System.out.println("You are alllowed to apply");
		
	}
	
	public static void main(String arg[])
	{
		try{
			age(19);//will execute
			age(15);//will give AgeException
			age(23);//will not execute
		}catch(AgeException e)
		{
			System.out.println("Not a valid age "+e);
		}
	}
}