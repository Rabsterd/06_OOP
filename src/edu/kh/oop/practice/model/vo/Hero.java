package edu.kh.oop.practice.model.vo;

public class Hero {
	
	private String job;
	private int HP;
	private int MP;
	private char gender;
	private int level;
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	public Hero() { // ctrl + space + enter
		
	}
	public void attack() {  
		System.out.println(job + "가 기본 공격을 했다.(-150)");
	}
	public void jump() {
		System.out.println(job + "의 점프!");
	}
}
