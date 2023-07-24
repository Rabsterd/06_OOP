package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {
	
	public void ex1() {
		// 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		// new People : 새로운 People 객체를 Heap 영역에 생성
		
		// ** 클래스 이름이 자료형처럼 사용된다
		// == 그래서 클래스를 "사용자 정의 자료형이라고도 한다 *****
		
		//캡슐화
		// - 데이터와 기능을 하나로 묶어서 관리하는 기법
		// - 데이터의 직접적인 접근을 제한하는 것이 원칙
		// -> 직접접근을 못하기 때문에
		//		클래스 내부에 간접 접근 방법을 제공하는 기능을 작성해둔다
		
		// p1.name = "홍길동";
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setGender('남');
		p1.setPhone("010-1234-5678");
		p1.setpNo("200301-1234567");
		p1.setAddress("만동 1길 34 지언아파드 102동 111호");
		
		
		System.out.println("p1의 name : " + p1.getName());
		System.out.println("p1의 age : " + p1.getAge());
		System.out.println("p1의 gender : " + p1.getGender());
		System.out.println("p1의 phone : " + p1.getPhone());
		System.out.println("p1의 pNo : " + p1.getpNo());
		System.out.println("p1의 address : " + p1.getAddress());
		
		
	}
	public void ex2() {
		
		People p2 = new People();
		
		p2.setName("권민석");
		p2.setAge(26);
		p2.setGender('남');
		p2.setPhone("010-9574-6658");
		p2.setpNo("980725-1234567");
		p2.setAddress("문동 1길42 센드럴 푸르지오 105동 902호");
		
		System.out.println("p2의 name : " + p2.getName());
		System.out.println("p2의 age : " + p2.getAge());
		System.out.println("p2의 gender : " + p2.getGender());
		System.out.println("p2의 phone : " + p2.getPhone());
		System.out.println("p2의 pNo : " + p2.getpNo());
		System.out.println("p2의 address : " + p2.getAddress());
		
	}
}
