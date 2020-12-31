
class S1
{
	public void add()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		S2.add();
		System.out.println("4");
		System.out.println("5");
	}
	
}
class S2
{
	public static void add() {
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		S3.add();
		System.out.println("9");
		System.out.println("10");
	}
}
class S3
{
	public static void add(){
		System.out.println("11");
		System.out.println("12");
		System.out.println("13");
		try {
		System.out.println(2/0);
		}catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("14");
		System.out.println("15");
		
	}
}
public class ExceptionDemo1 {
	
	public static void main(String[] args) {
		S1 s1 = new S1();
			s1.add();
		System.out.println("Welcome");
	}

}
