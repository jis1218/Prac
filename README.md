# 자바 변수 설정 및 연산, 출력 연습

## 배운 것

### 1. 정수 연산은 모두 integer로 대체된다
```java

    byte a = 10;
		byte b = 11;
		long y = 32423423523L; //역시 int로 인식한다. 따라서 L을 붙여줘야 함
		int c = a + b; //연산이 이뤄지는 순간 a와 b를 int로 인식한다. integer 계산으로 인식한다. 따라서 c의 타입은 int가 되어야 함
    
```
    
### 2. 실수 연산은 모두 double로 대체된다.
```java
    float d = 3.14f; //실수는 모두 double로 대체된다. 따라서 f를 붙여준다.
		float e = 4.1928f;
		//float f = d + e; //이렇게 계산하면 안된다.	
		float f = Float.sum(d, e);	
		double g = 5.232;
		double h = 1.424; //double i = g + h; //이렇게 계산하면 안된다.
		double i = Double.sum(g, h);
```

### 3. 접근 제한자

##### public : 모든 클래스와 패키지에서 접근 가능
##### private : 자기 클래스에서만 접근 가능
##### protected : 같은 패키지에서는 접근 가능하나 다른 패키지에서는 상속 받았을 때만 가능
##### default : 같은 패키지에서 접근 가능
