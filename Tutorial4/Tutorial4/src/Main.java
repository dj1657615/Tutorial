
public class Main {

	final static int SECOND = 1000;
	
	public static void main(String[] args) {

		int minute =SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute + "��" + second + "��");
		
		int a =10; 
		System.out.println("������ a�� "+ a + " �Դϴ�.");
		a++;
		System.out.println("������ a�� "+ a + " �Դϴ�.");
		System.out.println("������ a�� "+ ++a + " �Դϴ�.");
		System.out.println("������ a�� "+ a++ + " �Դϴ�.");
		System.out.println("������ a�� "+ a + " �Դϴ�.");
		
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
		int a1 = 50;
		int b = 50;
		
		System.out.println("a�� b�� ��������? " + (a1 == b));
		System.out.println("a�� b���� ū����? " + (a > b));
		System.out.println("a�� b���� ��������? " + (a1 < b));
		System.out.println("a�� b�� �����鼭 a�� 30���� ū����? " + ((a1 == b) && (a > b)));
		System.out.println("a�� 50�� �ƴѰ���? " + !(a1 == 50));
		
		
		double a3 = Math.pow(3.0, 20.0);
		System.out.println("3�� 20������" + (int) a3 + "�Դϴ�");
		
		
		int x = 50;
		int y = 60;
		
		System.out.println("�ִ���" + max(x, y) + "�Դϴ�");
		
		
		}
		
		static int max(int a2, int b) {
			int result = (a2 > b) ? a2 : b;
			return result;
		}
	}
