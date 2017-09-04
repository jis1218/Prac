
public class Sub {
	
	
	String var  = "안녕하세요";

	
	public void area(int radius){
		// 정수 연산은 모두 integer로 대체됨
		double pi = 3.14; //소모되서 없어질 변수는 메소드 안에 선언해 주는게 좋음
		byte a = 10;
		byte b = 11;
		long y = 32423423523L; //역시 int로 인식한다. 따라서 L을 붙여줘야 함
		int c = a + b; //연산이 이뤄지는 순간 a와 b를 int로 인식한다. integer 계산으로 인식한다. 따라서 c의 타입은 int가 되어야 함
		
		float d = 3.14f; //실수는 모두 double로 대체된다. 따라서 f를 붙여준다.
		float e = 4.1928f;
		
		//float f = d + e; //이렇게 계산하면 안된다.
		
		float f = Float.sum(d, e);
		
		double g = 5.232;
		double h = 1.424;
		
		//double i = g + h; //이렇게 계산하면 안된다.
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
