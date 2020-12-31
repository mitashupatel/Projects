
/*class AgeValidation extends Exception
{
	AgeValidation(String msg)
	{
		super(msg);
	}
}*/
public class TryCatchDemo extends Exception{
	
	public TryCatchDemo(String msg) {
		super(msg);
	}
	public static void main(String[] args)   {
		
		int age = 17;
		
			if(age<=18)
			{
				try {
					throw new TryCatchDemo("its Wrong age");
				} catch (TryCatchDemo e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		System.out.println("result = "+age);
	}

}
