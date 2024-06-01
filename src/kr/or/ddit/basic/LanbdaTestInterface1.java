package kr.or.ddit.basic;

///깃허브 연결된겨?

///이 어노테이션을 붙이는 순간 FunctionalInterface가 된다, 추상메서드가 한개인 인터페이스를 말한다
@FunctionalInterface
public interface LanbdaTestInterface1 {
	
	// 반환값이 없고, 매개변수도 없는 추상메서드 선언
	public void test();
//	public void test2(); 이게 있으면 추상메서드가 2개가 돼서 FunctionalInterface가 아니라는 에러가 뜬다
}

///각각의 파일로 인터페이스 만들면 interface 앞에 public 붙여야 하는데 한 파일로만드니깐 public 빼준다
@FunctionalInterface
interface LanbdaTestInterface2 {
	// 반환값이 없고, 매개변수는 있는 추상메서드 선언
	public void test(int a);
	
	
	
}

@FunctionalInterface
interface LanbdaTestInterface3 {
	// 반환값이 있고, 매개변수도 있는 추상메서드 선언
	public int test(int a, int b);
	
}