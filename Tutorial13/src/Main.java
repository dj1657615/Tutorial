import java.util.Scanner;

public class Main {

	public static int max(int a, int b) {
		return (a > b) ? a : b;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �迭�� ũ�⸦ �Է��ϼ��� : ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for(int i = 0; i < number;  i++)
		{
			System.out.println("�迭�� �Է��� ������ �ϳ��� �Է��ϼ��� : ");
			array[i] = scanner.nextInt();
		}
		
		

	}

}
