
public class Sub {
	
	
	String var  = "�ȳ��ϼ���";

	
	public void area(int radius){
		// ���� ������ ��� integer�� ��ü��
		double pi = 3.14; //�Ҹ�Ǽ� ������ ������ �޼ҵ� �ȿ� ������ �ִ°� ����
		byte a = 10;
		byte b = 11;
		long y = 32423423523L; //���� int�� �ν��Ѵ�. ���� L�� �ٿ���� ��
		int c = a + b; //������ �̷����� ���� a�� b�� int�� �ν��Ѵ�. integer ������� �ν��Ѵ�. ���� c�� Ÿ���� int�� �Ǿ�� ��
		
		float d = 3.14f; //�Ǽ��� ��� double�� ��ü�ȴ�. ���� f�� �ٿ��ش�.
		float e = 4.1928f;
		
		//float f = d + e; //�̷��� ����ϸ� �ȵȴ�.
		
		float f = Float.sum(d, e);
		
		double g = 5.232;
		double h = 1.424;
		
		//double i = g + h; //�̷��� ����ϸ� �ȵȴ�.
		double i = Double.sum(g, h);
	}
	
	public String changeNumberToString(int number){
		return number+"";
	}
	
	public Long changeStringToLong(String word){
		return Long.parseLong(word);
	}
	
	public int changeStringToInteger(String word){
		return Integer.parseInt(word);
	}

}
