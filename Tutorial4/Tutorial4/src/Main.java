
public class Main {

	final static int SECOND = 1000;
	
	public static void main(String[] args) {

		int minute =SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "분" + second + "초");
		
		int a =10; 
		System.out.println("현재의 a는 "+ a + " 입니다.");
		a++;
		System.out.println("현재의 a는 "+ a + " 입니다.");
		System.out.println("현재의 a는 "+ ++a + " 입니다.");
		System.out.println("현재의 a는 "+ a++ + " 입니다.");
		System.out.println("현재의 a는 "+ a + " 입니다.");
		
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int a1 = 50;
		int b = 50;
		
		System.out.println("a와 b가 같은가요? " + (a1 == b));
		System.out.println("a가 b보다 큰가요? " + (a > b));
		System.out.println("a가 b보다 작은가요? " + (a1 < b));
		System.out.println("a가 b와 같으면서 a가 30보다 큰가요? " + ((a1 == b) && (a > b)));
		System.out.println("a가 50이 아닌가요? " + !(a1 == 50));
		
		
		double a3 = Math.pow(3.0, 20.0);
		System.out.println("3의 20제곱은" + (int) a3 + "입니다");
		
		
		int x = 50;
		int y = 60;
		
		System.out.println("최댓값은" + max(x, y) + "입니다");
		
		
		}
		
		static int max(int a2, int b) {
			int result = (a2 > b) ? a2 : b;
			return result;
		}
	}
