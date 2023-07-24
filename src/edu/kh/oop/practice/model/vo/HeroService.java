package edu.kh.oop.practice.model.vo;

public class HeroService {
	public void practice() {
		Hero h1 = new Hero();
		
		h1.setJob("워리어");
		h1.setHP(18000);
		h1.setMP(5000);
		h1.setGender('남');
		h1.setLevel(5);
		
	
		
		Hero h2 = new Hero();
		
		h2.setJob("마법사");
		h2.setHP(5000);
		h2.setMP(25000);
		h2.setGender('여');
		h2.setLevel(2);
		
		
		
		Hero h3 = new Hero();
		
		h3.setJob("힐러");
		h3.setHP(10000);
		h3.setMP(50000);
		h3.setGender('남');
		h3.setLevel(10);

		System.out.println("직업 : " + h1.getJob());
		System.out.println("hp : " + h1.getHP());
		System.out.println("mp : " + h1.getMP());
		System.out.println("성별 : " + h1.getGender());
		System.out.println("현재 레벨은 " + h1.getLevel() +" 입니다.\n");
	
		System.out.println("직업 : " + h2.getJob());
		System.out.println("hp : " + h2.getHP());
		System.out.println("mp : " + h2.getMP());
		System.out.println("성별 : " + h2.getGender());
		System.out.println("현재 레벨은 " + h2.getLevel() +" 입니다.\n");
		
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		h2.attack();
		System.out.println("\n직업 : " + h1.getJob());
		System.out.println("hp : " + (h1.getHP() - 150));
		System.out.println("mp : " + h1.getMP());
		System.out.println("성별 : " + h1.getGender());
		System.out.println("현재 레벨은 " + h1.getLevel() +" 입니다.\n");
	
		System.out.println("===========================");
		
		System.out.println("직업 : " + h3.getJob());
		System.out.println("hp : " + h3.getHP());
		System.out.println("mp : " + h3.getMP());
		System.out.println("성별 : " + h3.getGender());
		System.out.println("현재 레벨은 " + h3.getLevel() +" 입니다.\n");
		h3.jump();
	
	}
	
}
