package day05.Ex01_상속;

public class Jiwoo extends Raichu{
	public static void main(String[] args) {
		
		Pikachu pikachu = new Pikachu();
		
		//겍체의 정보를 빠르게 확인하고 싶을 때
		//출력문에 객체를 출력시 : toString()메소드가 반환한 문자열이 출력된다.
		System.out.println(pikachu);
		
		System.out.println(":::::::피카츄:::::::::");
		System.out.println("에너지 : "+pikachu.energy);
		System.out.println("타입 :"+pikachu.type);
		System.out.println("공격A:"+pikachu.aAttack());
		System.out.println("공격B"+pikachu.bAttack());
		System.out.println();
		
		Pikachu pikachu2 = new Pikachu(150,"진화");
		
		System.out.println(":::::::피카츄(Lv20):::::::::");
		System.out.println("에너지 : "+pikachu2.energy);
		System.out.println("타입 :"+pikachu2.type);
		System.out.println("공격A :"+pikachu2.aAttack());
		System.out.println("공격B :"+pikachu2.bAttack());
		System.out.println();
		
		Raichu raichu = new Raichu();
		
		System.out.println(":::::::라이츄(Lv20):::::::::");
		System.out.println("에너지 : "+raichu.energy);
		System.out.println("타입 :"+raichu.type);
		System.out.println("공격A :"+raichu.aAttack());
		System.out.println("공격B :"+raichu.bAttack());
		System.out.println("공격C :"+raichu.cAttack());
		System.out.println();
		
		
	}
}
