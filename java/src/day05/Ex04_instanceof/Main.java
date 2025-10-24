package day05.Ex04_instanceof;

import day05.Ex01_상속.Pikachu;
import day05.Ex01_상속.Raichu;

public class Main {
	public static void main(String[] args) {
		

		Raichu raichu = new Raichu();

		System.out.println(raichu instanceof Raichu);
		System.out.println(raichu instanceof Pikachu);
		
		Pikachu pikachu = new Pikachu();

		System.out.println(pikachu instanceof Raichu);
		System.out.println(pikachu instanceof Pikachu);
		
		if(pikachu instanceof Raichu) {}
		if(pikachu instanceof Pikachu) {}
	}

}
