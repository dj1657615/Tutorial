
public class Main {

	public static void main(String[] args) {

		double a = 10.3;
		double b = 9.6;
		double c = 10.1;
		
		System.out.println((a+b+c) / 3);
		
		for(char i = 'a'; i <= 'z'; i++)
		{
			System.out.println(i+"  ");
		}
	int a1 = 200;
	
	System.out.println("10진수 : " + a1);
	System.out.format("8진수 : %o\n",a1);
	System.out.format("16지수 :%x", a1);
	
	String name = "Paul Wal";
			System.out.println(name);
	System.out.println(name.substring(0, 1));
	System.out.println(name.substring(3, 6));
	System.out.println(name.substring(2, 6));
	}

}

