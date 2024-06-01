package kr.or.ddit.basic;
///깃허브 연결된겨?

public class T01LambdaTest {
/*
 	람다식  => 익명함수를 생성하기 위한 식, 자바에서는 '매개변수를 가진 코드 블럭'
 			런타임시 => 익명구현객체로 생성된다.
 	
 			
 	사용 예) 인터페이스명 객체변수명 = 람다식;
 	
 	람다식의 형태 : (매개변수들...) -> {처리할 코드들; ...}
 	
 	 => 람다식으로 변환할 수 있는 익명구현겍체는 추상메서드가 1개인 인터페이스인 경우에만 가능하다.
 	 이러한 인터페이스를 '함수적 인터페이스(Functional Interface)'라고 부른다.
 */
	
	public static void main(String[] args) {
		
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <=10; i++) {
					System.out.println(i);
				}
			}
		});
		th1.start();
		
		// 람다식을 사용하는 경우...
		///익명구현객체
		Thread th2 = new Thread(
						() -> { ///매개변수는 존재하지 않는다
							for (int i = 1; i <=10; i++) {
								System.out.println("람다-"+i);
							}
							
						}
				
					);
		th2.start();
	}
}