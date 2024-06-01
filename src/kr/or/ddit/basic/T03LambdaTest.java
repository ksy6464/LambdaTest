package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class T03LambdaTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("김민강");
		list.add("이현수");
		list.add("권기혁");
		
		///기존에 for문으로 출력
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println("-----------------------------");
		
		///forEach, Consumer타입 : 매개변수 하나에 리턴타입 없는..
		///보통 파라미터로 기본타입이나 객체를 넣는데 여기는 함수를 넣는 형태로 코딩을 할 수 있다
		list.forEach(name -> System.out.println(name));
		
		///////////////////////////////////////////////////////
		list.forEach(System.out::println);
		///System.out::println ::의 문법의미는 메서드 참조이다
		/// System.out 객체가 제공하는 println을 사용
		
		///////////////////////////////////////////////////////
		/*  메서드 참조의 일반적인 형태
		 
		  참조변수::인스턴스메서드명
		  클새스명::정적메서드명
		  클래스명::인스턴스메서트명
		  생성자명::new
		  
		 */
		
		Myprint mp = new Myprint(); ///참조변수(객체를 참조하는)
		
		System.out.println("참조변수::인스턴스메서드명...");
		list.forEach(mp::printName);
		
		System.out.println("클새스명::정적메서드명...");
		list.forEach(Myprint::printName2);
		
		System.out.println("클새스명::정적메서드명...");
		list.forEach(Myprint::new); 
		///에러가 남, consumer객체 못해준다 why?파라미터를 받는 메서드가 아니기때문에 즉, 이 생성자로는 consumer타입 못한다
		///파라미터 있는 생성자 필요하다
		/// class Myprint에 public Myprint(String name) { 이거해주니깐 에러 사라짐
		
		
	}
}


class Myprint {
	public Myprint() {///이게 생성자, 생성자이름은 클래스이름과 같다
		///생성자와 메소드와의 차이점은 리턴이 없다 
		// TODO Auto-generated constructor stub
	}
	public Myprint(String name) {
		System.out.println("생성자에서 출력함... :"+name);
	}
	
	public void printName(String name) {
		System.out.println("name : "+name);
	}
	
	public static void printName2(String name) {
		System.out.println("name : "+name);
	}
}
